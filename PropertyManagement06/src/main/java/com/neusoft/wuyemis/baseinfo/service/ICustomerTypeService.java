package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;


import com.neusoft.wuyemis.baseinfo.model.CustomerTypeModel;

public interface ICustomerTypeService {
	//增加
	public void addCustomerType(CustomerTypeModel customerTypeModel) throws Exception;
	//删除
	public void deleteCustomerType(CustomerTypeModel customerTypeModel)throws Exception;
	//修改
	public void modifyCustomerType(CustomerTypeModel customerTypeModel)throws Exception;

	//取得所有的列表
	public List<CustomerTypeModel> selectListByAll() throws Exception;
	//取得个数
	public int getCountByAll() throws Exception;
	//取得页数
	public int getPagaCountByAll(int rows) throws Exception;
	//
	public List<CustomerTypeModel> getListByAllWithPage(int rows,int page) throws Exception;

}
