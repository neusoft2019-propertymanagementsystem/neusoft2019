package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.CustomerHomeModel;

public interface ICustomerHomeDao {
	public void create(CustomerHomeModel CustomerHome) throws Exception;
	public void update(CustomerHomeModel CustomerHome) throws Exception;
	public void delete(CustomerHomeModel CustomerHome) throws Exception;
	public List<CustomerHomeModel> selectListByAll() throws Exception;

}
