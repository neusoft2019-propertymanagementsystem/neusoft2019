package com.neusoft.wuyemis.admin.dao;

import java.util.List;

import com.neusoft.wuyemis.admin.model.SystemFunctionModel;

/*
 * 模块：admin
 * SystemFunction的Dao接口
 * @Author: 张云强
 */
public interface ISystemFunctionDao {
     
	public void create(SystemFunctionModel systemfuntionModel) throws Exception;
	
	public void update(SystemFunctionModel systemfuntionModel) throws Exception;

	public void delete(SystemFunctionModel systemfuntionModel) throws Exception;

	public List<SystemFunctionModel> selsctListByAll() throws Exception;
	
	

}
