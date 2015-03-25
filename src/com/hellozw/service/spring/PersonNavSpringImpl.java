package com.hellozw.service.spring;

import java.util.List;

import com.hellozw.dao.IPersonNavDAO;
import com.hellozw.model.PersonalNav;
import com.hellozw.service.IPersonNavService;

public class PersonNavSpringImpl implements IPersonNavService {

	private IPersonNavDAO personNavDAO;
	
	public void setPersonNavDAO(IPersonNavDAO personNavDAO) {
		this.personNavDAO = personNavDAO;
	}

	/**
	 * 获取所有的用户导航菜单数据
	 */
	@Override
	public List<PersonalNav> findAllPersonalNavs() {
		List<PersonalNav> personalNavs = null;
		try {
			personalNavs = personNavDAO.findAllPersonalNav();
		} catch (RuntimeException e) {
			System.out
					.println("findAllPersonalNavs方法出错，出错原因：" + e.getMessage());
		}
		return personalNavs;
	}	

	/**
	 * 添加用户导航数据
	 */
	@Override
	public void savePersonalNav(PersonalNav personalNav) {
		try {
			personNavDAO.savePersonalNav(personalNav);
		} catch (Exception e) {
			System.out.println("addPersonalNav方法出错，出错原因：" + e.getMessage());
		}
	}

	@Override
	public List<PersonalNav> findAllByType(PersonalNav type) {
		List<PersonalNav> personalNavs = null;
		try {
			personalNavs = personNavDAO.findAllByType(type);
		} catch (Exception e) {
			System.out.println("findAllByType方法出错，出错原因：" + e.getMessage());
		}
		return personalNavs;
	}

	@Override
	public void delPersonalNav(PersonalNav personalNav) {
		try {
			personNavDAO.delPersonalNav(personalNav);
		} catch (Exception e) {
			System.out.println("delPersonalNav方法出错，出错原因：" + e.getMessage());
		}		
	}

	@Override
	public int findPersonalNavOfLinkCount(PersonalNav personalNav) {
		try {
			return personNavDAO.findPersonalNavOfLinkCount(personalNav);
		} catch (Exception e) {
			System.out.println("findPersonalNavOfLinkCount方法出错，出错原因：" + e.getMessage());
			return 0;
		}
	}

	@Override
	public void updatePersonalNav(PersonalNav personalNav) {
		try {
			personNavDAO.updatePersonalNav(personalNav);
		} catch (Exception e) {
			System.out.println("updatePersonalNav方法出错，出错原因：" + e.getMessage());
		}		
	}
}
