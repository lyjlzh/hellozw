package com.hellozw.model;

import java.sql.Timestamp;
import java.util.Set;

/**
 * 图片文件类
 * 
 * @author Administrator
 * 
 */
public class FileInfo extends BaseModel {
	// id
	private String id;

	// 名称
	private String name;

	// 类型
	private int type;

	// 地址
	private String path;

	// 创建时间
	private Timestamp createDt;

	// 更新时间
	private Timestamp updateDt;

	// 链接(多对一)
	private Link link = new Link();

	// 项目获奖(多对一)
	private ProjectAward projectAward = new ProjectAward();

	// 用户动态(多对一)
	private UserDynamicInfo userDynamicInfo = new UserDynamicInfo();

	// 日记(多对一)
	private Diary diary = new Diary();

	// 娱乐(多对一)
	private BookMusicMovie bookMusicMovie = new BookMusicMovie();
	
	//配置(多对一)
	private Configuration configuration = new Configuration();

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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public ProjectAward getProjectAward() {
		return projectAward;
	}

	public void setProjectAward(ProjectAward projectAward) {
		this.projectAward = projectAward;
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

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
}
