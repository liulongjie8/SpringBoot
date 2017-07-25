package com.lls.springboot.iterceptor;

import java.io.Serializable;

public class ValidationModel implements Serializable {

	private String uid;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

}
