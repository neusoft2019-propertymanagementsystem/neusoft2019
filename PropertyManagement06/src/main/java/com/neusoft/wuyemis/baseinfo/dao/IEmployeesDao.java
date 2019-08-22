package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.baseinfo.model.EmployeesModel;
@Mapper
public interface IEmployeesDao {
	public void create(EmployeesModel employeesModel) throws Exception;
	public void update(EmployeesModel employeesModel) throws Exception;
	public void delete(EmployeesModel employeesModel) throws Exception;
	public List<EmployeesModel> selectListByAll() throws Exception;

	
}
