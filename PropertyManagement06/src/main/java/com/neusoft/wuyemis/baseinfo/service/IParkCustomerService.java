package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.ParkCustomerModel;

public interface IParkCustomerService {
	//增加
	public void addParkCustomer(ParkCustomerModel parkcustomerModel) throws Exception;
	//删除
	public void deleteParkCustomer(ParkCustomerModel parkcustomerModel)throws Exception;
	//修改
	public void modifyParkCustomer(ParkCustomerModel parkcustomerModel)throws Exception;

	//取得所有的列表
	public List<ParkCustomerModel> selectListByAll() throws Exception;
	//取得个数
	public int getCountByAll() throws Exception;
	//取得页数
	public int getPagaCountByAll(int rows) throws Exception;
	//
	public List<ParkCustomerModel> getListByAllWithPage(int rows,int page) throws Exception;

}
