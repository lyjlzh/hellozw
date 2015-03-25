package com.hellozw.service;

import com.hellozw.model.*;
import com.hellozw.dao.*;

public interface IUserService {
	
	/**
	 * 
	 * @param userInfo
	 * @return
	 */
	public abstract UserInfo saveNewUser(UserInfo userInfo);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public abstract UserInfo findUserById(String id);

	/**
	 * 
	 * @param userDAO
	 */
	public abstract void setUserDAO(IUserInfoDAO userDAO);
}
