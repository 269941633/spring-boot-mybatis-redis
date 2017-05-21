package com.fei.springboot.domain;

import java.io.Serializable;

/**
 * 放进redis中的对象，必须Serializable序列化
 * @author Jfei
 *
 */
public class User {


	private String id;
	
	private String userName;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
}
