package com.hellozw.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import org.apache.struts2.json.annotations.JSON;

/**
 * 链接表
 * 
 * @author Administrator
 * 
 */
public class Link extends BaseModel {
	// id
	private String id;

	// 链接名称
	private String name;

	// 链接地址
	private String url;

	// 网站图标
	private String icon;

	// 显示顺序
	private int level;

	// 类型
	private int type;

	// 介绍说明
	private String introduction;

	// 创建时间
	private Timestamp createDt;

	// 更新时间
	private Timestamp updateDt;

	// 个性导航(多对一)
	private PersonalNav personalNav;

	// 文件信息列表(一对多)
	private Set<FileInfo> fileInfos = new HashSet<FileInfo>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Timestamp getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Timestamp createDt) {
		this.createDt = createDt;
	}

	public Timestamp getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Timestamp updateDt) {
		this.updateDt = updateDt;
	}

	public PersonalNav getPersonalNav() {
		return personalNav;
	}

	public void setPersonalNav(PersonalNav personalNav) {
		this.personalNav = personalNav;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Set<FileInfo> getFileInfos() {
		return fileInfos;
	}

	public void setFileInfos(Set<FileInfo> fileInfos) {
		this.fileInfos = fileInfos;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
