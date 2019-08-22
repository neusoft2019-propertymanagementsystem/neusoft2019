package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.ParkModel;
@Mapper
public interface IParkDao {
	public void insert(ParkModel parkModel) throws Exception;
	public void update(ParkModel parkModel) throws Exception;
	public void delete(ParkModel parkModel) throws Exception;
	public List<ParkModel> selectListByAll() throws Exception;
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<ParkModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;

}
