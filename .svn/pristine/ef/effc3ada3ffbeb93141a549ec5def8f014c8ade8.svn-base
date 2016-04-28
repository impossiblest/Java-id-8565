package com.baidu.ee.msg;

import com.baidu.ee.msg.service.IMsg;
import com.baidu.ee.msg.vo.MsgVo;

/**
 * 邮件消息
 * @author Jord
 *
 */
public class EmailMsg extends BaseMsg implements IMsg{
	
	public EmailMsg() {
		this.msgType = "EMAIL";
	}

	public EmailMsg(MsgVo vo) {
		super(vo);
		this.msgType = "EMAIL";
	}

	@Override
	public boolean sendMsg() {
		System.out.println("消息类型："+this.msgType);
		System.out.println("发信人："+this.getFrom());
		System.out.println("收信人："+this.getTo());
		System.out.println("内容：："+this.getContent());
		return true;
	}

}
