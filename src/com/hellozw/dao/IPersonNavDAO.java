package com.hellozw.dao;

import java.util.List;

import com.hellozw.model.PersonalNav;

public interface IPersonNavDAO {

	/**
	 * 查询所有导航标题菜单
	 * 
	 * @return
	 */
	List<PersonalNav> findAllPersonalNav();

	/**
	 * 根据导航类型查询导航列表
	 * @return
	 */
	List<PersonalNav> findAllByType(PersonalNav type);

	/**
	 * 添加用户导航菜单
	 * 
	 * @param name
	 */
	void savePersonalNav(PersonalNav name);
	
	/**
	 * 删除导航
	 * @param personalNav
	 */
	void delPersonalNav(PersonalNav personalNav);
	
	/**
	 * 更新导航
	 * @param personalNav
	 */
	void updatePersonalNav(PersonalNav personalNav);
	
	/**
	 * 根据导航名称查询导航列表
	 * @return
	 */
	List<PersonalNav> findAllByName(PersonalNav personalNav);
	
	/**
	 * 查询导航下链接的个数
	 * @return
	 */
	int findPersonalNavOfLinkCount(PersonalNav personalNav);
}
