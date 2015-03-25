package com.hellozw.model;

import java.sql.Timestamp;
/**
 * 用户信息类
 * @author Administrator
 *
 */
public class UserInfo extends BaseModel{
	//id
	private String id;
	
	//登录名
	private String loginName;
	
	//密码
	private String password;
	
	//创建时期
	private Timestamp createDt;
	
	//更新日期
	private Timestamp updateDt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Timestamp createDt) {
		this.createDt = createDt;
	}

	public Timestamp getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Timestamp updateDt) {
		this.updateDt = updateDt;
	}

	
}
