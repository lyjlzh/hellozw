package com.hellozw.dao;
import java.util.List;

import com.hellozw.model.Link;

public interface ILinkDAO{
	
	/**
	 * 根据导航id获取导航链接
	 * @param id
	 * @return
	 */
	List<Link> QueryLinkByNavId(String id);
	
	/**
	 * 根据名称查询链接
	 * @param name
	 * @return
	 */
	List<Link> QueryLinkByName(String name);
	
	/**
	 * 保存链接
	 * @param link
	 */
	void saveLink(Link link);
	
	/**
	 * 编辑链接
	 * @param link
	 */
	void updateLink(Link link);
	
	/**
	 * 删除链接
	 * @param link
	 */
	void delLink(Link link);
}
