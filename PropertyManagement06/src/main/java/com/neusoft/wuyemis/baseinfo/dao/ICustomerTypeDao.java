package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.CustomerModel;
import com.neusoft.wuyemis.baseinfo.model.CustomerTypeModel;
@Mapper
public interface ICustomerTypeDao {
	public void create(CustomerTypeModel customerTypeModel) throws Exception;
	public void update(CustomerTypeModel customerTypeModel) throws Exception;
	public void delete(CustomerTypeModel customerTypeModel) throws Exception;
	public List<CustomerTypeModel> selectListByAll() throws Exception;
	
	//为此客户类型增加一个客户
	public void addCustomer(@Param("TYPENO") String TYPENO ,@Param("CustomerNO") int CustomerNO)throws Exception;
	//取得指定客户类型的客户列表
	public List<CustomerModel> selectCustomerListByCustomertype() throws Exception;

}
