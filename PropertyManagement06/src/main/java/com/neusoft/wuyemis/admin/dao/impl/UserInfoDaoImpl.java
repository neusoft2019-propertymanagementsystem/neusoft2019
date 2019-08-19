package com.neusoft.wuyemis.admin.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.neusoft.wuyemis.admin.factory.ConnectionFactoryWithJNDI;
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
		//Class.forName("com.mysql.jdbc.Driver");
        //Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/propertymanagement?serverTimezone=GMT%2B8","root","root");
		
		Connection cn=ConnectionFactoryWithJNDI.getConnection();
		String sql="insert into userinfo values (?,?,?,?)";
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, userInfoMosel.getUserinfoId());
        ps.setString(2,userInfoMosel.getUserinfoPassword() );
		ps.setString(3, userInfoMosel.getUserinfoName());
		ps.setString(4, userInfoMosel.getUserinfoStatus());
		ps.executeLargeUpdate();
		ps.close();
		cn.close();
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
