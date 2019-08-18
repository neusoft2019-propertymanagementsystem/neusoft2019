package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.CustomerTypeModel;

public interface ICustomerTypeDao {
	public void create(CustomerTypeModel customerTypeModel) throws Exception;
	public void update(CustomerTypeModel customerTypeModel) throws Exception;
	public void delete(CustomerTypeModel customerTypeModel) throws Exception;
	public List<CustomerTypeModel> selectListByAll() throws Exception;

}
