package com.hellozw.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * 复杂类
 * 
 * @author Administrator
 * 
 */
public class BookMusicMovie extends BaseModel {
	// id
	private String id;

	// 名称
	private String name;

	// 作者
	private String author;

	// 国家
	private String country;

	// 类型一
	private int type1;

	// 类型二
	private int type2;

	// 介绍
	private String introduction;

	// 读后感
	private String review;

	// 创建时间
	private Timestamp createDt;

	// 更新时间
	private Timestamp updateDt;

	// 评论列表(一对多)
	private Set<Comment> comments = new HashSet<Comment>();

	// 图片列表(一对多)
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
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
