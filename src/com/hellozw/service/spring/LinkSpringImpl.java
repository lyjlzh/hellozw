package com.hellozw.service.spring;

import java.util.List;

import com.hellozw.dao.ILinkDAO;
import com.hellozw.model.Link;
import com.hellozw.service.ILinkService;

public class LinkSpringImpl implements ILinkService {

	private ILinkDAO linkDAO;

	/**
	 * 根据navid获取链接地址
	 */
	@Override
	public List<Link> FindByNavId(String id) {
		List<Link> list = null;
		try {
			list = linkDAO.QueryLinkByNavId(id);
		} catch (Exception e) {
			System.out.println("FindByNavId方法出错：" + e.getMessage());
		}
		return list;
	}

	public void setLinkDAO(ILinkDAO linkDAO) {
		this.linkDAO = linkDAO;
	}

	@Override
	public void saveLink(Link link) {
		linkDAO.saveLink(link);		
	}

	@Override
	public void delLink(Link link) {
		linkDAO.delLink(link);		
	}

	@Override
	public void updateLink(Link link) {
		linkDAO.updateLink(link);		
	}

	@Override
	public List<Link> QueryLinkByName(String name) {
		return linkDAO.QueryLinkByName(name);
	}
}
