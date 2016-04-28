package com.baidu.ee.msg.vo;

/**
 * 消息vo
 * @author Jord
 *
 */
public class MsgVo {

	/**
	 * 消息发信人
	 */
	private String from;
	/**
	 * 消息内容
	 */
	private String content;
	/**
	 * 消息收信人
	 */
	private String to;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
}
