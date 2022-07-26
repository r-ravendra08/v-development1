package com.model;

// Generated Jul 20, 2022 3:06:03 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Post generated by hbm2java
 */
public class Post implements java.io.Serializable {

	private Integer pid;
	private Categories categories;
	private String title;
	private String message;
	private String image;
	private Integer userId;
	private Date pdate;

	public Post() {
	}

	public Post(Date pdate) {
		this.pdate = pdate;
	}

	public Post(Categories categories, String title, String message, String image, Integer userId, Date pdate) {
		this.categories = categories;
		this.title = title;
		this.message = message;
		this.image = image;
		this.userId = userId;
		this.pdate = pdate;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getPdate() {
		return this.pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

}
