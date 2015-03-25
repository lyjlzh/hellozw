package com.hellozw.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * 个性导航类
 * 
 * @author Administrator
 * 
 */
public class PersonalNav extends BaseModel{
	// id
	private String id;
	
	// 节点名称
	private String name;

	// 节点类型
	private int type;
	
	//显示顺序
	private int level;

	// 创建时间
	private Timestamp createDt;

	// 更新时间
	private Timestamp updateDt;
	
	//链接列表(一对多)
	private Set<Link> links = new HashSet<Link>();

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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	public Set<Link> getLinks() {
		return links;
	}

	public void setLinks(Set<Link> links) {
		this.links = links;
	}

}
