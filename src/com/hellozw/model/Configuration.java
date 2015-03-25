package com.hellozw.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class Configuration extends BaseModel {
	//id
	private String id;
	
	//名称
	private String name;
	
	//类型
	private int type;
	
	//内容
	private String content;
	
	//创建时间
	private Timestamp createDt;
	
	//更新时间
	private Timestamp updateDt;
	
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public Set<FileInfo> getFileInfos() {
		return fileInfos;
	}

	public void setFileInfos(Set<FileInfo> fileInfos) {
		this.fileInfos = fileInfos;
	}
}
