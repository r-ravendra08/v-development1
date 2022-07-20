package com.model;

// Generated Jul 20, 2022 3:06:03 AM by Hibernate Tools 3.4.0.CR1

/**
 * Temple generated by hbm2java
 */
public class Temple implements java.io.Serializable {

	private Integer tid;
	private String name;
	private String address;
	private String sfunction;
	private String distance;
	private String images;
	private String staphana;
	private String type;

	public Temple() {
	}

	public Temple(String name, String address, String sfunction, String distance, String images, String staphana,
			String type) {
		this.name = name;
		this.address = address;
		this.sfunction = sfunction;
		this.distance = distance;
		this.images = images;
		this.staphana = staphana;
		this.type = type;
	}

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSfunction() {
		return this.sfunction;
	}

	public void setSfunction(String sfunction) {
		this.sfunction = sfunction;
	}

	public String getDistance() {
		return this.distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getStaphana() {
		return this.staphana;
	}

	public void setStaphana(String staphana) {
		this.staphana = staphana;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
