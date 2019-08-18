package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.AreaModel;


public interface IAreaDao {
	public void create(AreaModel areaModel) throws Exception;
	public void update(AreaModel areaModel) throws Exception;
	public void delete(AreaModel areaModel) throws Exception;
	
	public List<AreaModel> selectListByAll() throws Exception;
}
