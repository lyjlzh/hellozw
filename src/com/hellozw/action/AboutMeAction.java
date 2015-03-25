package com.hellozw.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class AboutMeAction extends ActionSupport {

	public static final String MESSAGE = "Struts 2 Hello World Tutorial(java zhangwei)!";

	public String execute() throws Exception {
		// ������ʾ��ҳ�����Ϣ
		setMessage(MESSAGE);
		return SUCCESS;
	}

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getCurrentTime() {
		return new Date().toString();
	}
}
