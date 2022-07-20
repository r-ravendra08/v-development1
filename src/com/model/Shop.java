package com.model;

// Generated Jul 20, 2022 3:06:03 AM by Hibernate Tools 3.4.0.CR1

/**
 * Shop generated by hbm2java
 */
public class Shop implements java.io.Serializable {

	private Integer id;
	private String name;
	private String mobile;
	private String image;

	public Shop() {
	}

	public Shop(String name, String mobile, String image) {
		this.name = name;
		this.mobile = mobile;
		this.image = image;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
