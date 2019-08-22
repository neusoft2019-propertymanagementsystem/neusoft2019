package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.CustomerHomeModel;

public interface ICustomerHomeService {
	//增加
	public void addCustomerHome(CustomerHomeModel customerhomeModel) throws Exception;
	//删除
	public void deleteCustomerHome(CustomerHomeModel customerhomeModel)throws Exception;
	//修改
	public void modifyCustomerHome(CustomerHomeModel customerhomeModel)throws Exception;

	//取得所有的列表
	public List<CustomerHomeModel> selectListByAll() throws Exception;
	//取得个数
	public int getCountByAll() throws Exception;
	//取得页数
	public int getPagaCountByAll(int rows) throws Exception;
	//
	public List<CustomerHomeModel> getListByAllWithPage(int rows,int page) throws Exception;

}
