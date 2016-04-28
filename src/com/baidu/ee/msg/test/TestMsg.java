package com.baidu.ee.msg.test;

import com.baidu.ee.msg.factory.EmailMsgCreator;
import com.baidu.ee.msg.service.IMsg;
import com.baidu.ee.msg.vo.MsgVo;

/**
 * 测试
 * @author Jord
 *
 */
public class TestMsg {

	public static void main(String[] args) {
		
		MsgVo vo  = new MsgVo();
		vo.setFrom("Jord");
		vo.setTo("Susan");
		vo.setContent("Nice to meet u.How U doing...");
		//TODO 工厂方法模式可以考虑用动态代理 代替
		IMsg msg = EmailMsgCreator.getInstance().create(vo);
		msg.sendMsg();
	}

}
