package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.BuildingTypeModel;

public interface IBuildingTypeDao {
	public void create(BuildingTypeModel buildingTypeModel) throws Exception;
	public void update(BuildingTypeModel buildingTypeModel) throws Exception;
	public void delete(BuildingTypeModel buildingTypeModel) throws Exception;
	public List<BuildingTypeModel> selectListByAll() throws Exception;

}
