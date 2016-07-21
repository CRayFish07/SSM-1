package com.ssm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssm.entity.User;

public interface UserService {
	public User findUser(int id);
}
