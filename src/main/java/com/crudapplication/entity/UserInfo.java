package com.crudapplication.entity;

public class UserInfo {
	private String user_name = null;
	private String first_name = null;
	private String last_name = null;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getUser_role() {
		return user_role;
	}

	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int user_role = 0;
	private int id = 0;
}
