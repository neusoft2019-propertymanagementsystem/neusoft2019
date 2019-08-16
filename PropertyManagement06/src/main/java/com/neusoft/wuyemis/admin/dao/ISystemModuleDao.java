package com.neusoft.wuyemis.admin.dao;
/*
 * 模块：admin
 * SystemModule的DAO层接口
 * @Author: 张云强
 */

import java.util.List;

import com.neusoft.wuyemis.admin.model.SystemFunctionModel;
import com.neusoft.wuyemis.admin.model.SystemFunctionUserModel;
import com.neusoft.wuyemis.admin.model.SystemModuleModel;

public interface ISystemModuleDao {
     
	public void create(SystemModuleModel systemModuleModel) throws Exception;
	
	public void update(SystemModuleModel systemModuleModel) throws Exception;

	public void delete(SystemModuleModel systemModuleModel) throws Exception;

	public List<SystemModuleModel> selsctListByAll() throws Exception;
	

	
}
