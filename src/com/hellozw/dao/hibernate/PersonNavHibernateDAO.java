package com.hellozw.dao.hibernate;

import java.sql.Timestamp;
import java.util.List;

import com.hellozw.dao.IPersonNavDAO;
import com.hellozw.model.PersonalNav;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class PersonNavHibernateDAO extends HibernateDaoSupport implements
		IPersonNavDAO {

	/**
	 * 获取所有的用户导航菜单数据
	 */
	@Override
	public List<PersonalNav> findAllPersonalNav() {
		List<PersonalNav> personalNavs = (List<PersonalNav>) getHibernateTemplate()
				.loadAll(PersonalNav.class);
		return personalNavs;
	}

	/**
	 * 添加用户导航数据
	 */
	@Override
	public void savePersonalNav(PersonalNav personalNav) {
		getHibernateTemplate().save(personalNav);
	}

	@Override
	public List<PersonalNav> findAllByType(PersonalNav personalNav) {
		try {
			if (personalNav.getType() == 0) {
				return findAllPersonalNav();
			}
			@SuppressWarnings("unchecked")
			List<PersonalNav> personalNavs = (List<PersonalNav>) getHibernateTemplate()
					.find("select p from PersonalNav p where p.type like ? order by p.level",
							personalNav.getType());
			return personalNavs;
		} catch (Exception e) {
			System.out.println("findAllByType出错：" + e.getMessage());
			return null;
		}
	}

	@Override
	public List<PersonalNav> findAllByName(PersonalNav personalNav) {
		try {
			@SuppressWarnings("unchecked")
			List<PersonalNav> personalNavs = (List<PersonalNav>) getHibernateTemplate()
					.find("select p from PersonalNav p where p.name=?",
							personalNav.getName());
			return personalNavs;
		} catch (Exception e) {
			System.out.println("findAllByName出错：" + e.getMessage());
			return null;
		}
	}

	/**
	 * 删除导航
	 */
	@Override
	public void delPersonalNav(PersonalNav personalNav) {
		try {
			PersonalNav personalNav2=getHibernateTemplate().load(PersonalNav.class, personalNav.getId());
			getHibernateTemplate().delete(personalNav2);
		} catch (Exception e) {
			System.out.println("delPersonalNav出错:" + e.getMessage());
		}

	}

	/**
	 * 查询导航下链接的个数
	 */
	@Override
	public int findPersonalNavOfLinkCount(PersonalNav personalNav) {
		int count;
		try {
			PersonalNav personalNav2 = getHibernateTemplate().load(
					PersonalNav.class, personalNav.getId());
			count = personalNav2.getLinks().size();
			return count;

		} catch (Exception e) {
			System.out
					.println("findPersonalNavOfLinkCount出错:" + e.getMessage());
			return 0;
		}
	}

	@Override
	public void updatePersonalNav(PersonalNav personalNav) {
		try {
			PersonalNav personalNav2 = getHibernateTemplate().load(
					PersonalNav.class, personalNav.getId());
			if (personalNav.getName() != null) {
				personalNav2.setName(personalNav.getName());
			}
			if (personalNav.getLevel()!= 0) {
				personalNav2.setLevel(personalNav.getLevel());
			}
			if (personalNav.getType() != 0) {
				personalNav2.setType(personalNav.getType());
			}
			personalNav2.setUpdateDt(new Timestamp(System.currentTimeMillis()));
			getHibernateTemplate().update(personalNav2);
		} catch (Exception e) {
			System.out.println("updatePersonalNav出错:" + e.getMessage());
		}
	}

}
