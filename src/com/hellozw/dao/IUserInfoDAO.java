package com.hellozw.dao;

import com.hellozw.model.*;

public interface IUserInfoDAO{
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public abstract UserInfo findUserById(final String id);

	/**
	 * 保存用户
	 * @param order
	 * @return
	 */
	public abstract UserInfo saveUser(final UserInfo user);
}
