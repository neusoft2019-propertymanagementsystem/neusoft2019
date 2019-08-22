package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.BuildingModel;

public interface IBuildingService {
		//增加
		public void addBuilding(BuildingModel buildingModel) throws Exception;
		//删除
		public void deleteBuilding(BuildingModel buildingModel)throws Exception;
		//修改
		public void modifyBuilding(BuildingModel buildingModel)throws Exception;

		//取得所有的列表
		public List<BuildingModel> selectListByAll() throws Exception;
		//取得个数
		public int getCountByAll() throws Exception;
		//取得页数
		public int getPagaCountByAll(int rows) throws Exception;
		//
		public List<BuildingModel> getListByAllWithPage(int rows,int page) throws Exception;
	

}
