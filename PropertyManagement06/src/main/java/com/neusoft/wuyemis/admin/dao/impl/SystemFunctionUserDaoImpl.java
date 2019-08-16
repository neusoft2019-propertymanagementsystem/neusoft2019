package com.neusoft.wuyemis.admin.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.neusoft.wuyemis.admin.dao.ISystemFunctionUserDao;
import com.neusoft.wuyemis.admin.factory.ConnectionFactoryWithJNDI;
import com.neusoft.wuyemis.admin.model.SystemFunctionUserModel;
/*
 * 模块：admin
 * systemfuntion的Dao实现类
 * @Author: 张云强
 */
public class SystemFunctionUserDaoImpl implements ISystemFunctionUserDao {

	@Override
	public void create(SystemFunctionUserModel systemfuntionMdoel) throws Exception {
		Connection cn=ConnectionFactoryWithJNDI.getConnection();
		String sql="insert into userinfo values (?,?,?,)";
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setInt(1, systemfuntionMdoel.getFunNo());
		ps.setString(2, systemfuntionMdoel.getUserID());

	}

	@Override
	public void update(SystemFunctionUserModel systemfuntionMdoel) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SystemFunctionUserModel systemfuntionMdoel) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SystemFunctionUserModel> selsctListByAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
