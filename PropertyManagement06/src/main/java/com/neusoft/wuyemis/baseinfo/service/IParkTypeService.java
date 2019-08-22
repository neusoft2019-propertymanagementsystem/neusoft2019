package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.ParkTypeModel;

public interface IParkTypeService {
	//增加
	public void addParkType(ParkTypeModel parkTypeModel) throws Exception;
	//删除
	public void deleteParkType(ParkTypeModel parkTypeModel)throws Exception;
	//修改
	public void modifyParkType(ParkTypeModel parkTypeModel)throws Exception;

	//取得所有的列表
	public List<ParkTypeModel> selectListByAll() throws Exception;
	//取得个数
	public int getCountByAll() throws Exception;
	//取得页数
	public int getPagaCountByAll(int rows) throws Exception;
	//
	public List<ParkTypeModel> getListByAllWithPage(int rows,int page) throws Exception;

}
