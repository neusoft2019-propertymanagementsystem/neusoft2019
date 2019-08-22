package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.BuildingModel;
import com.neusoft.wuyemis.baseinfo.model.CustomerModel;
import com.neusoft.wuyemis.baseinfo.model.ParkModel;
import com.neusoft.wuyemis.baseinfo.model.RoomModel;
@Mapper
public interface IBuildingDao {
	public void insert(BuildingModel buildingModel) throws Exception;
	public void update(BuildingModel buildingModel) throws Exception;
	public void delete(BuildingModel buildingModel) throws Exception;
	public List<BuildingModel> selectListByAll() throws Exception; 
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<BuildingModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;
	
	//给楼宇增加房间
	public void addRoom(@Param("BuildingNo")String BuildingNo, @Param("ROOMNO") int ROOMNO) throws Exception; 
	//为楼宇增加多个房间
	public void addRooms(@Param("BuildingNo") String BuildingNo, @Param("ROOMNOList") int[] ROOMNOList) throws Exception;
	//取得楼宇的所有房间
	public List<RoomModel> selectRoomListByBuilding() throws Exception;
	//取得楼宇和房间关联的个数
	public int selectRoomCountByBuilding(@Param("BuildingNo")String BuildingNo, @Param("ROOMNO") int ROOMNO)throws Exception;
	
	//给楼宇增加车位
	public void addPark(@Param("BuildingNO")String BuildingNO, @Param("ParkNO") int ParkNO ) throws Exception; 
	//给楼宇增加多个车位
	public void addParks(@Param("BuildingNO") String BuildingNO, @Param("ParkNOList") int[] ParkNOList) throws Exception;
	//取得楼宇的所有车位
	public List<ParkModel> selectParkListByBuilding() throws Exception;
	//取得楼宇和车位的关联个数
	public int selectParkCountByBuilding(@Param("BuildingNO")String BuildingNO, @Param("ParkNO") int ParkNO)throws Exception;
	
	
	
	
	

}
