package com.baidu.ee.msg.test;

import com.baidu.ee.msg.EmailMsg;
import com.baidu.ee.msg.factory.EmailMsgCreator;
import com.baidu.ee.msg.proxy.MsgProxy;
import com.baidu.ee.msg.service.IMsg;
import com.baidu.ee.msg.vo.MsgVo;

/**
 * ����
 * @author Jord
 *
 */
public class TestMsg {

	public static void main(String[] args) {
		
		MsgVo vo  = new MsgVo();
		vo.setFrom("Jord");
		vo.setTo("Susan");
		vo.setContent("Nice to meet u.How U doing...");
		//TODO ��������ģʽ���Կ����ö�̬���� ����
		IMsg msg = null;
//		msg = EmailMsgCreator.getInstance().create(vo);
//		msg.sendMsg();
		
		//��̬����
		Object target = new EmailMsg(vo);
		msg = (IMsg)MsgProxy.getInstance().bind(target);
		msg.sendMsg();
	}

}
