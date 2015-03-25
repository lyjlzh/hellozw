package com.hellozw.model;

import java.sql.Timestamp;

/**
 * 评论类
 * @author Administrator
 *
 */
public class Comment extends BaseModel {
	//id
	private String id;
	
	//名称
	private String name;
	
	//内容
	private String content;
	
	//创建时间
	private Timestamp createDt;
	
	//更新时间
	private Timestamp updateDt;
	
	//用户动态(多对一)
	private UserDynamicInfo userDynamicInfo = new UserDynamicInfo();
	
	//日记(多对一)
	private Diary diary = new Diary();
	
	//娱乐(多对一)
	private BookMusicMovie bookMusicMovie = new BookMusicMovie();

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

	public UserDynamicInfo getUserDynamicInfo() {
		return userDynamicInfo;
	}

	public void setUserDynamicInfo(UserDynamicInfo userDynamicInfo) {
		this.userDynamicInfo = userDynamicInfo;
	}

	public Diary getDiary() {
		return diary;
	}

	public void setDiary(Diary diary) {
		this.diary = diary;
	}

	public BookMusicMovie getBookMusicMovie() {
		return bookMusicMovie;
	}

	public void setBookMusicMovie(BookMusicMovie bookMusicMovie) {
		this.bookMusicMovie = bookMusicMovie;
	}
}
