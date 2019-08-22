package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;


import com.neusoft.wuyemis.baseinfo.model.ParkModel;

public interface IParkService {
	//增加
	public void addPark(ParkModel parkModel) throws Exception;
	//删除
	public void deletePark(ParkModel parkModel)throws Exception;
	//修改
	public void modifyPark(ParkModel parkModel)throws Exception;

	//取得所有的列表
	public List<ParkModel> selectListByAll() throws Exception;
	//取得个数
	public int getCountByAll() throws Exception;
	//取得页数
	public int getPagaCountByAll(int rows) throws Exception;
	//
	public List<ParkModel> getListByAllWithPage(int rows,int page) throws Exception;


}
