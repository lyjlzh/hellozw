package com.hellozw.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.json.annotations.JSON;

import com.hellozw.model.Link;
import com.hellozw.model.PersonalNav;
import com.hellozw.model.ZwJson;
import com.hellozw.service.ILinkService;

public class LinkAction extends ActionSupport {
	private List<Link> linkList = new ArrayList<Link>();
	private ILinkService linkService;
	private Link link;
	private PersonalNav personalNav;

	/**
	 * 根据名称查询链接
	 * 
	 * @return
	 */
	public String QueryLinkByName() {
		linkList = linkService.QueryLinkByName(link.getName());
		return SUCCESS;
	}

	/**
	 * 保存导航下的链接
	 */
	public void saveLink() {
		getLink().setCreateDt(new Timestamp(System.currentTimeMillis()));
		getLink().setUpdateDt(new Timestamp(System.currentTimeMillis()));
		getLink().setPersonalNav(personalNav);
		linkService.saveLink(link);
	}

	/**
	 * 更新链接
	 */
	public void updateLink() {
		getLink().setPersonalNav(personalNav);
		linkService.updateLink(link);
	}

	/**
	 * 删除链接
	 * 
	 * @return
	 */
	public String delLink() {
		linkService.delLink(link);
		return SUCCESS;
	}

	public List<Link> getLinkList() {
		return linkList;
	}

	public void setLinkList(List<Link> linkList) {
		this.linkList = linkList;
	}

	public void setLinkService(ILinkService linkService) {
		this.linkService = linkService;
	}

	@JSON(serialize = false)
	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	@JSON(serialize = false)
	public PersonalNav getPersonalNav() {
		return personalNav;
	}

	public void setPersonalNav(PersonalNav personalNav) {
		this.personalNav = personalNav;
	}
}
