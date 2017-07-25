package com.lls.springboot.service;

import com.lls.springboot.bean.User;

public interface UserService {

	User findById(String id);
}
