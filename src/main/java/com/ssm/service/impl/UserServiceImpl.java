package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.entity.User;
import com.ssm.service.UserService;



@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserMapper dao;

	public User findUser(int id) {
		// TODO Auto-generated method stub
		User user = dao.selectByPrimaryKey(id);
		return user;
	}
}
