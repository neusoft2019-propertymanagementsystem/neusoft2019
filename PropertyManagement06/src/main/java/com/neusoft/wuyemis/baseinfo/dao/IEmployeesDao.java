package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.EmployeesModel;
@Mapper
public interface IEmployeesDao {
	public void insert(EmployeesModel employeesModel) throws Exception;
	public void update(EmployeesModel employeesModel) throws Exception;
	public void delete(EmployeesModel employeesModel) throws Exception;
	public List<EmployeesModel> selectListByAll() throws Exception;
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<EmployeesModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;

	
}
