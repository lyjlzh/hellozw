package com.hellozw.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * 项目获奖类
 * @author Administrator
 *
 */
public class ProjectAward extends BaseModel {
	//id
	private String id;
	
	//名称
	private String name;
	
	//类型1，1：项目，2：获奖
	private int type1;
	
	//类型2
	private int type2;
	
	//内容 
	private String content;
	
	//描述
	private String description;
	
    //创建时间
	private Timestamp createDt;
	
	//更新时间
	private Timestamp updateDt;
	
	//简历(多对一)
	private ResumeInfo resumeInfo;
	
	//文件图片列表(一对多)
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

	public int getType1() {
		return type1;
	}

	public void setType1(int type1) {
		this.type1 = type1;
	}

	public int getType2() {
		return type2;
	}

	public void setType2(int type2) {
		this.type2 = type2;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public ResumeInfo getResumeInfo() {
		return resumeInfo;
	}

	public void setResumeInfo(ResumeInfo resumeInfo) {
		this.resumeInfo = resumeInfo;
	}

	public Set<FileInfo> getFileInfos() {
		return fileInfos;
	}

	public void setFileInfos(Set<FileInfo> fileInfos) {
		this.fileInfos = fileInfos;
	}
}
