package com.jsp.isa.dto;

import java.io.Serializable;

public class EmailDto implements Serializable{
	
	private String subject;
	private String to;
	private String from;
	private String msgBody;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}
	@Override
	public String toString() {
		return "EmailDto [subject=" + subject + ", to=" + to + ", from=" + from + ", msgBody=" + msgBody + "]";
	}

}