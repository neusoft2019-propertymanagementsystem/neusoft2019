package com.neusoft.wuyemis.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.admin.model.SystemFunctionModel;

/*
 * 模块：admin
 * SystemFunction的Dao接口
 * @Author: 张云强
 */
@Mapper
public interface ISystemFunctionDao {
     //增
	public void create(SystemFunctionModel systemfuntionModel) throws Exception;
	
	public void update(SystemFunctionModel systemfuntionModel) throws Exception;
	//删
	public void delete(SystemFunctionModel systemfuntionModel) throws Exception;
    
	public List<SystemFunctionModel> selsctListByAll() throws Exception;
	
	

}
