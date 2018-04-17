package com.mybatisdemo.beans;

public class User {
	private Integer id;
	private String username;
	private String birthdate;	//or int?
	private String address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String birthdate, String address) {
		super();
		this.username = username;
		this.birthdate = birthdate;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {                 
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setbirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + username + ", birthdate=" + birthdate
				+ ", address=" + address + "]";
	}
}
