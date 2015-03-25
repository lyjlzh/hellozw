package com.hellozw.service;

import java.util.List;

import com.hellozw.model.Link;

/**
 * 链接服务接口
 * 
 * @author zhangwei
 *
 */
public interface ILinkService {
	/**
	 * 根据navid获取链接地址
	 * @param id
	 * @return
	 */
	List<Link> FindByNavId(String id);
	
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
	 * 更新链接
	 * @param link
	 */
	void updateLink(Link link);
	
	/**
	 * 删除链接
	 * @param link
	 */
	void delLink(Link link);
}
