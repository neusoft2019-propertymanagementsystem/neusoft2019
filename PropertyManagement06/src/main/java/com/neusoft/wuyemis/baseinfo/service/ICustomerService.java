package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.CustomerModel;

public interface ICustomerService {
	//增加
	public void addCustomer(CustomerModel customerModel) throws Exception;
	//删除
	public void deleteCustomer(CustomerModel customerModel)throws Exception;
	//修改
	public void modifyCustomer(CustomerModel customerModel)throws Exception;

	//取得所有的列表
	public List<CustomerModel> selectListByAll() throws Exception;
	//取得个数
	public int getCountByAll() throws Exception;
	//取得页数
	public int getPagaCountByAll(int rows) throws Exception;
	//
	public List<CustomerModel> getListByAllWithPage(int rows,int page) throws Exception;

}
