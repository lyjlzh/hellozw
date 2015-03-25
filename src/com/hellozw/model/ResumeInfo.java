package com.hellozw.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * 简历类
 * @author Administrator
 *
 */
public class ResumeInfo extends BaseModel{
	//id
	private String id;
	
	//介绍
	private String introduction;
	
	//创建时间
	private Timestamp createDt;
	
	//更新时间
	private Timestamp updateDt;

	//项目获奖列表(一对多)
	private Set<ProjectAward> projectAwards = new HashSet<ProjectAward>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Set<ProjectAward> getProjectAwards() {
		return projectAwards;
	}

	public void setProjectAwards(Set<ProjectAward> projectAwards) {
		this.projectAwards = projectAwards;
	}
}
