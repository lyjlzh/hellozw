package com.hellozw.service;

import java.util.List;

import com.hellozw.model.PersonalNav;
import com.hellozw.dao.IPersonNavDAO;

public interface IPersonNavService {

	/**
	 * 查询所有导航标题菜单
	 * 
	 * @return
	 */
	List<PersonalNav> findAllPersonalNavs();

	/**
	 * 添加用户导航菜单
	 * 
	 * @param name
	 */
	void savePersonalNav(PersonalNav personalNav);

	/**
	 * 删除导航
	 * 
	 * @param personalNav
	 */
	void delPersonalNav(PersonalNav personalNav);
	
	/**
	 * 更新导航
	 * @param personalNav
	 */
	void updatePersonalNav(PersonalNav personalNav);

	/**
	 * 
	 * @param type
	 * @return
	 */
	List<PersonalNav> findAllByType(PersonalNav type);
	
	
	/**
	 * 查询导航下链接的个数
	 * @return
	 */
	int findPersonalNavOfLinkCount(PersonalNav personalNav);
}
