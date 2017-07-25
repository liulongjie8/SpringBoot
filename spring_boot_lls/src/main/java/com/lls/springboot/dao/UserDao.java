package com.lls.springboot.dao;

import com.lls.springboot.bean.User;

public interface UserDao {

	User findById(String id);
}
