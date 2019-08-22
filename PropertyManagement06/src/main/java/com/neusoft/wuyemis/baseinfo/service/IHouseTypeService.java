package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;


import com.neusoft.wuyemis.baseinfo.model.HouseTypeModel;

public interface IHouseTypeService {
	//增加
	public void addHouseType(HouseTypeModel houseTypeModel) throws Exception;
	//删除
	public void deleteHouseType(HouseTypeModel houseTypeModel)throws Exception;
	//修改
	public void modifyHouseType(HouseTypeModel houseTypeModel)throws Exception;

	//取得所有的列表
	public List<HouseTypeModel> selectListByAll() throws Exception;
	//取得个数
	public int getCountByAll() throws Exception;
	//取得页数
	public int getPagaCountByAll(int rows) throws Exception;
	//
	public List<HouseTypeModel> getListByAllWithPage(int rows,int page) throws Exception;

}
