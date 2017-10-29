package com.gjq.repository.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gjq.repository.dao.IUserDao;
import com.gjq.repository.pojo.User;
import com.gjq.repository.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}