package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.MaintainTypeModel;
@Mapper
public interface IMaintainTypeDao {
	public void insert(MaintainTypeModel maintainTypeModel) throws Exception;
	public void update(MaintainTypeModel maintainTypeModel) throws Exception;
	public void delete(MaintainTypeModel maintainTypeModel) throws Exception;
	public List<MaintainTypeModel> selectListByAll() throws Exception;
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<MaintainTypeModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;

}
