package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.CustomerHomeModel;
import com.neusoft.wuyemis.baseinfo.model.CustomerModel;
@Mapper
public interface ICustomerDao {
	public void insert(CustomerModel customerModel) throws Exception;
	public void update(CustomerModel customerModel) throws Exception;
	public void delete(CustomerModel customerModel) throws Exception;
	public List<CustomerModel> selectListByAll() throws Exception;
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<CustomerModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;
	
	//关联方法
	//为客户增加客户房间表
	public void addCustomerHome() throws Exception;
	//取得指定客户的客户-房间表
	public List<CustomerHomeModel> selectCustomerHomeListByCustomer() throws Exception;

}
