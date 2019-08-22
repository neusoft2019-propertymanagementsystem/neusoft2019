package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;


import com.neusoft.wuyemis.baseinfo.model.AreaModel;
import com.neusoft.wuyemis.baseinfo.model.BuildingModel;

//Area的Service层接口
public interface IAreaService {
	//增加小区
	public void addArea() throws Exception;
	//取得指定小区的所有楼宇
	public List<BuildingModel> selectBuildingListByAreaNo() throws Exception;
	//取得所有的小区列表
	public List<AreaModel> selectListByAll() throws Exception;
}
