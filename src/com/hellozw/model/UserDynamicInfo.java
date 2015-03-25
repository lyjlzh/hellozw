package com.hellozw.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户动态信息类
 * @author Administrator
 *
 */
public class UserDynamicInfo extends BaseModel {
	//id
	private String id;
	
	//内容
	private String content;
	
	//类型
	private int type;
	
	//创建时间
	private Timestamp createDt;
	
	//更新时间
	private Timestamp updateDt;
	
	//评论列表(一对多)
	private Set<Comment> comments = new HashSet<Comment>();
	
	//图片列表(一对多)
	private Set<FileInfo> fileInfos = new HashSet<FileInfo>();

	public String getId() { 
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Set<FileInfo> getFileInfos() {
		return fileInfos;
	}

	public void setFileInfos(Set<FileInfo> fileInfos) {
		this.fileInfos = fileInfos;
	}
}
