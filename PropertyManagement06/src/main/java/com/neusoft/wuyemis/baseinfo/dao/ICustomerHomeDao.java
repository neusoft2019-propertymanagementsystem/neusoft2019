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
@Mapper
public interface ICustomerHomeDao {
	public void insert(CustomerHomeModel customerHomeModel) throws Exception;
	public void update(CustomerHomeModel customerHomeModel) throws Exception;
	public void delete(CustomerHomeModel customerHomeModel) throws Exception;
	public List<CustomerHomeModel> selectListByAll() throws Exception;
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<CustomerHomeModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;
	

}
