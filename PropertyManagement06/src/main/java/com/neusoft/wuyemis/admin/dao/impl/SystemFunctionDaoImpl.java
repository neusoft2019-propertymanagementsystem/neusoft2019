package com.neusoft.wuyemis.admin.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.neusoft.wuyemis.admin.dao.ISystemFunctionDao;
import com.neusoft.wuyemis.admin.factory.ConnectionFactoryWithJNDI;
import com.neusoft.wuyemis.admin.model.SystemFunctionModel;
/*
 * 模块：admin
 * systemfuntion的Dao实现类
 * @Author: 张云强
 */
public class SystemFunctionDaoImpl implements ISystemFunctionDao {

	@Override
	public void create(SystemFunctionModel systemfuntionModel) throws Exception {
		Connection cn=ConnectionFactoryWithJNDI.getConnection();
		String sql="insert into userinfo values (?,?,?,?)";
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setInt(1, systemfuntionModel.getFunNo());
		ps.setString(2, systemfuntionModel.getFunName());
		ps.setString(3, systemfuntionModel.getFunUrl());
		ps.setInt(4, systemfuntionModel.getLeveNo());
		ps.setInt(5, systemfuntionModel.getMno());
		ps.executeLargeUpdate();
		ps.close();
		cn.close();
	}

	@Override
	public void update(SystemFunctionModel systemfuntionModel) throws Exception {
		
	}

	@Override
	public void delete(SystemFunctionModel systemfuntionModel) throws Exception {
		

	}

	@Override
	public List<SystemFunctionModel> selsctListByAll() throws Exception {
		
		return null;
	}

}
