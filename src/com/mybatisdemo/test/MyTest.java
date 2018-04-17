package com.mybatisdemo.test;

import org.junit.Before;
import org.junit.Test;

import com.mybatisdemo.beans.User;
import com.mybatisdemo.dao.IUserDao;
import com.mybatisdemo.dao.UserDaoImpl;

public class MyTest {
	private IUserDao dao;

	@Before
	public void before() {
		dao = new UserDaoImpl();
	}
	
	@Test
	public void testInsert() {
		User user = new User("Test2", "May 1989", "Xizhimen");
		dao.insertUser(user);
	}
	
}
