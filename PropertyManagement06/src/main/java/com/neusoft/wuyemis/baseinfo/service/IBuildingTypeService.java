package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;


import com.neusoft.wuyemis.baseinfo.model.BuildingTypeModel;


public interface IBuildingTypeService {
	//增加建筑类型
	public void addBuildingType(BuildingTypeModel buildingTypeModel) throws Exception;
	//删除
	public void deleteBuildingType(BuildingTypeModel buildingTypeModel)throws Exception;
	//修改
	public void modifyBuildingType(BuildingTypeModel buildingTypeModel)throws Exception;
	
	
	//取得建筑类型的个数
	public int getCountByAll() throws Exception;
	//取得建筑类型页数
	public int getPagaCountByAll(int rows) throws Exception;
	//取得所有建筑类型的列表
	public List<BuildingTypeModel> getListByAllWithPage(int rows,int page) throws Exception;

}
