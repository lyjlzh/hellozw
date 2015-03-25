package com.hellozw.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.text.SimpleDateFormat;

import com.hellozw.model.*;
import com.hellozw.service.*;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private UserInfo userInfo;
	private IUserService userService;

	@Override
	public String execute() throws Exception {
		// Timestamp ts = new Timestamp();
		// SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		getUserInfo().setCreateDt(new Timestamp(System.currentTimeMillis()));
		getUserInfo().setUpdateDt(new Timestamp(System.currentTimeMillis()));
		getUserService().saveNewUser(getUserInfo());
		return SUCCESS;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
