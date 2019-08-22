package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;


import com.neusoft.wuyemis.baseinfo.model.AreaModel;
import com.neusoft.wuyemis.baseinfo.model.BuildingModel;

//Area的Service层接口
public interface IAreaService {
	//增加小区
	public void addArea(AreaModel areaModel) throws Exception;
	//删除小区
	public void deleteArea(AreaModel areaModel)throws Exception;
	//修改小区
	public void modifyArea(AreaModel areaModel)throws Exception;
	
	//取得指定小区的所有楼宇
	public List<BuildingModel> selectBuildingListByAreaNo() throws Exception;
	//取得所有的小区列表
	public List<AreaModel> selectListByAll() throws Exception;
	
	//取得小区的个数
	public int getCountByAll() throws Exception;
	//取得小区页数
	public int getPagaCountByAll(int rows) throws Exception;
	//
	public List<AreaModel> getListByAllWithPage(int rows,int page) throws Exception;
}
