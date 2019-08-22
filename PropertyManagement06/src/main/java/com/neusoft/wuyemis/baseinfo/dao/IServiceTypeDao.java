package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.ServiceTypeModel;
@Mapper
public interface IServiceTypeDao {
	public void insert(ServiceTypeModel serviceTypeModel) throws Exception;
	public void update(ServiceTypeModel serviceTypeModel) throws Exception;
	public void delete(ServiceTypeModel serviceTypeModel) throws Exception;
	public List<ServiceTypeModel> selectListByAll() throws Exception;
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<ServiceTypeModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;

}
