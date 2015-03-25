package com.hellozw.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.json.annotations.JSON;

import com.hellozw.dao.IPersonNavDAO;
import com.hellozw.service.ILinkService;
import com.hellozw.model.PersonalNav;
import com.hellozw.model.Link;
import com.hellozw.model.ZwJson;
import com.hellozw.service.IPersonNavService;

/*
 * 导航菜单action
 */
@SuppressWarnings("serial")
public class MainAction extends ActionSupport {

	private List<PersonalNav> navList = new ArrayList<PersonalNav>();
	private List<Link> linkList = new ArrayList<Link>();
	private ZwJson zwJson = new ZwJson();

	private IPersonNavService personNavService;
	private ILinkService linkService;

	private PersonalNav personalNav;
	

	public String index() {
		return SUCCESS;
	}

	/**
	 * 获取导航树节点json
	 * 
	 * @return
	 */
	public String loadNavList() {
		System.out.println("type=" + personalNav.getType());
		List<PersonalNav> personalNavs = personNavService
				.findAllByType(personalNav);
		for (PersonalNav p : personalNavs) {
			PersonalNav personalNav = new PersonalNav();
			personalNav.setId(p.getId());
			personalNav.setName(p.getName());
			navList.add(personalNav);
		}
		return SUCCESS;
	}

	/**
	 * 保存导航节点数据
	 * 
	 * @param name
	 * @return
	 */
	public void saveNav() {
		getPersonalNav().setCreateDt(new Timestamp(System.currentTimeMillis()));
		getPersonalNav().setUpdateDt(new Timestamp(System.currentTimeMillis()));
		personNavService.savePersonalNav(personalNav);
	}

	/**
	 * 删除导航
	 */
	public String delNav() {
		int count = personNavService.findPersonalNavOfLinkCount(personalNav);
		System.out.println("看这里：count=" + count);
		if (count == 0) {
			personNavService.delPersonalNav(personalNav);
			zwJson.setSuccess(true);
			zwJson.setMsg("删除成功");
			return SUCCESS;
		} else {
			zwJson.setSuccess(false);
			zwJson.setMsg("删除失败，请先删除底下的链接！");
			return SUCCESS;
		}
	}

	/**
	 * 更新导航
	 * @return
	 */
	public String updateNav() {
		personNavService.updatePersonalNav(personalNav);
		return SUCCESS;
	}

	

	/**
	 * 根据navid获取链接地址
	 * 
	 * @return
	 */
	public String loadLinkByNavId() {
		try {
			String idString = getPersonalNav().getId();
			List<Link> links = linkService.FindByNavId(idString);
			for (Link l : links) {
				Link link = new Link();
				link.setId(l.getId());
				link.setName(l.getName());
				link.setUrl(l.getUrl());
				link.setIcon(l.getIcon());
				linkList.add(link);
			}
			return SUCCESS;
		} catch (Exception e) {
			System.out.print("loadLinkByNavId出错:" + e.getMessage());
			return ERROR;
		}

	}

	public List<PersonalNav> getNavList() {
		return navList;
	}

	@JSON(serialize = false)
	public IPersonNavService getPersonNavService() {
		return personNavService;
	}

	public void setPersonNavService(IPersonNavService personNavService) {
		this.personNavService = personNavService;
	}

	@JSON(serialize = false)
	public PersonalNav getPersonalNav() {
		return personalNav;
	}

	public void setPersonalNav(PersonalNav personalNav) {
		this.personalNav = personalNav;
	}

	@JSON(serialize = false)
	public ILinkService getLinkService() {
		return linkService;
	}

	public void setLinkService(ILinkService linkService) {
		this.linkService = linkService;
	}

	public List<Link> getLinkList() {
		return linkList;
	}

	public void setLinkList(List<Link> linkList) {
		this.linkList = linkList;
	}


	public ZwJson getZwJson() {
		return zwJson;
	}

	public void setZwJson(ZwJson zwJson) {
		this.zwJson = zwJson;
	}
}
