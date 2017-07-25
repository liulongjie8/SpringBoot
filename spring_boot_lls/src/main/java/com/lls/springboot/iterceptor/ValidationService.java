package com.lls.springboot.iterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {

	@Autowired
	private Validation validate;

	/**
	 * 验证token是否合法
	 * 
	 * @param token
	 * @return
	 */
	public ValidationModel verifyAccessToken(String token) {

		return null;
	}
}
