package com.neusoft.wuyemis.admin.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.neusoft.wuyemis.admin.dao.IUserInfoDao;
import com.neusoft.wuyemis.admin.model.UserInfoModel;
/*
 * 模块：admin
 * userInfo的Dao实现类
 * @Author: 张云强
 */
public class UserInfoDaoImpl implements IUserInfoDao {

	@Override
	public void create(UserInfoModel userInfoMosel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc：mysql://localhost:3306/propertymanagement","root","root");
		String sql="insert into userinfo values (?,?,?,?,?,?,?)";
		PreparedStatement ps=cn.prepareStatement(sql);
       
	}

	@Override
	public void update(UserInfoModel userInfoMosel) throws Exception {
		

	}

	@Override
	public void delete(UserInfoModel userInfoMosel) throws Exception {
		
	}

	@Override
	public List<UserInfoModel> selectListByAll() throws Exception {
		
		return null;
	}

}
