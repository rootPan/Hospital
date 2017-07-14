package com.zp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zp.entity.User;
import com.zp.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper=null;
	public User Login(User user){
		return userMapper.login(user);
	}
}
