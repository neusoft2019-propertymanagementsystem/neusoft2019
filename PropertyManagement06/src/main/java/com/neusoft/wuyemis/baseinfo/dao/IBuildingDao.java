package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.BuildingModel;

public interface IBuildingDao {
	public void create(BuildingModel buildingModel) throws Exception;
	public void update(BuildingModel buildingModel) throws Exception;
	public void delete(BuildingModel buildingModel) throws Exception;
	
	public List<BuildingModel> selectListByAll() throws Exception; 
}
