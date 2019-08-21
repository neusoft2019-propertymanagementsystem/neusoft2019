package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.HouseTypeModel;
import com.neusoft.wuyemis.baseinfo.model.RoomModel;
@Mapper
public interface IHouseTypeDao {
	public void create(HouseTypeModel houseTypeModel) throws Exception;
	public void update(HouseTypeModel houseTypeModel) throws Exception;
	public void delete(HouseTypeModel houseTypeModel) throws Exception;
	public List<HouseTypeModel> selectListByAll() throws Exception;
	
	//为户型表增加房间
	public void addRoom(@Param("TYPENO") String TYPENO,@Param("ROOMNO") int ROOMNO)throws Exception;
	//取得指定户型的房间列表
	public List<RoomModel> selectRoomListByHouseType() throws Exception;

}
