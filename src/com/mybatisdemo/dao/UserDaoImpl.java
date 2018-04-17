package com.mybatisdemo.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatisdemo.beans.User;

public class UserDaoImpl implements IUserDao {

	private SqlSession sqlSession;

	@Override
	public void insertUser(User user) {
		try {
			
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession();
			
			sqlSession.insert("insertUser", user);
			
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}

}
