package com.model;

public class Pet {
	public Pet(int id, String name, String photo, String category, String tag, String status) {
		super();
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.category = category;
		this.tag = tag;
		this.status = status;
	}
	public Pet() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private int id;
	private String name;
	private String photo;
	private String category;
	private String tag;
	private String status;
}
