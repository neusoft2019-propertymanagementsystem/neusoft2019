   package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.AreaModel;


public interface IAreaDao {
	public void create(AreaModel areaModel) throws Exception;
	public void update(AreaModel areaModel) throws Exception;
	public void delete(AreaModel areaModel) throws Exception;
	//返回列表
	public List<AreaModel> selectListByAll() throws Exception;
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<AreaModel> selectListByAllWithPage(int star, int rows) throws Exception;
	//返回单个
	public AreaModel selectListById(String AREANO) throws Exception;
}
