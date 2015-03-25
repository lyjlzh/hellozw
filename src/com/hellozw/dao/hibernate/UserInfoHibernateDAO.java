package com.hellozw.dao.hibernate;

import java.util.List;

import com.hellozw.dao.IUserInfoDAO;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.hellozw.model.UserInfo;

public class UserInfoHibernateDAO extends HibernateDaoSupport implements IUserInfoDAO {
	@Override
	public UserInfo findUserById(String id) {
		UserInfo user = (UserInfo) getHibernateTemplate().load(UserInfo.class,
				id);
		return user;
	}
	@Override
	public UserInfo saveUser(UserInfo user) {
		getHibernateTemplate().save(user);
		return user;
	}	
}
