package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.ParkModel;
import com.neusoft.wuyemis.baseinfo.model.ParkTypeModel;
@Mapper
public interface IParkTypeDao {
	public void insert(ParkTypeModel parkTypeModel) throws Exception;
	public void update(ParkTypeModel parkTypeModel) throws Exception;
	public void delete(ParkTypeModel parkTypeModel) throws Exception;
	public List<ParkTypeModel> selectListByAll() throws Exception;
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<ParkTypeModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;
	
	//为车位类型增加车位
	public void addPark(@Param("TYPENO") String TYPENO,@Param("ParkNO")int ParkNO)throws Exception;
	//取得指定类型的车位列表
	public List<ParkModel> selectParkListByParkType() throws Exception;
}
