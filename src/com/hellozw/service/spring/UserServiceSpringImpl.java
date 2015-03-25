package com.hellozw.service.spring;

import java.util.Iterator;
import java.util.Set;

import com.hellozw.model.*;
import com.hellozw.service.IUserService;
import com.hellozw.dao.*;
import com.hellozw.dao.hibernate.*;

public class UserServiceSpringImpl implements IUserService {

	private IUserInfoDAO userInfoDao;

	@Override
	public UserInfo saveNewUser(UserInfo userInfo) {

		UserInfo saveUserInfo = null;
		try {
			saveUserInfo = getUserInfoDao().saveUser(userInfo);
		} catch (RuntimeException e) {
			System.out.println("Could not save user " + e.toString());
		}
		return saveUserInfo;
	}

	@Override
	public UserInfo findUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUserDAO(IUserInfoDAO userDAO) {
		this.userInfoDao = userDAO;
	}

	public IUserInfoDAO getUserInfoDao() {
		return userInfoDao;
	}

	public void setUserInfoDao(IUserInfoDAO userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
}
