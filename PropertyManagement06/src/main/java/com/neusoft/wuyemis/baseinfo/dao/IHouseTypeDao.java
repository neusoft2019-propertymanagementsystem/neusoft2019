package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.HouseTypeModel;
import com.neusoft.wuyemis.baseinfo.model.RoomModel;
@Mapper
public interface IHouseTypeDao {
	public void insert(HouseTypeModel houseTypeModel) throws Exception;
	public void update(HouseTypeModel houseTypeModel) throws Exception;
	public void delete(HouseTypeModel houseTypeModel) throws Exception;
	public List<HouseTypeModel> selectListByAll() throws Exception;
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<HouseTypeModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;
	
	//为户型表增加房间
	public void addRoom(@Param("TYPENO") String TYPENO,@Param("ROOMNO") int ROOMNO)throws Exception;
	//取得指定户型的房间列表
	public List<RoomModel> selectRoomListByHouseType() throws Exception;

}
