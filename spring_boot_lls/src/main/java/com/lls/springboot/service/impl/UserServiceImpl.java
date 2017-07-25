package com.lls.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lls.springboot.bean.User;
import com.lls.springboot.dao.UserDao;
import com.lls.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public User findById(String id) {
		return dao.findById(id);
	}

}
