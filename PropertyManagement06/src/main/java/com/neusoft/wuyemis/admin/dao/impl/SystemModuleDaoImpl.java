package com.neusoft.wuyemis.admin.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.neusoft.wuyemis.admin.dao.ISystemModuleDao;
import com.neusoft.wuyemis.admin.factory.ConnectionFactoryWithJNDI;
import com.neusoft.wuyemis.admin.model.SystemModuleModel;
/*
 * 模块：admin
 * systemModule的Dao实现类
 * @Author: 张云强
 */
public class SystemModuleDaoImpl implements ISystemModuleDao {

	@Override
	public void create(SystemModuleModel systemModuleModel) throws Exception {
		Connection cn=ConnectionFactoryWithJNDI.getConnection();
		String sql="insert into userinfo values (?,?)";
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setInt(1, systemModuleModel.getMNO());
		ps.setString(2, systemModuleModel.getMNAME());
		ps.executeLargeUpdate();
		ps.close();
		cn.close();
	}

	@Override
	public void update(SystemModuleModel systemModuleModel) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SystemModuleModel systemModuleModel) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SystemModuleModel> selsctListByAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
