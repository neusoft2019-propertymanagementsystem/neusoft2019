package com.neusoft.wuyemis.baseinfo.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//房间表
@Data
@Alias("Room")
public class RoomModel implements Serializable{
	private int ROOMNO = 0;		//房间编号
	private String DepartmentCode= null;		//单元
	private String Floor= null;		//楼层
	private String RoomCode= null;		//房间号
	private String BuildingArea = null;		//使用面积
	private String FeeArea = null;		//缴费面积
	private String RoomStatus = null;		//房间状态（空闲/入住）
	private String RoomType= null;		//房间类型（room:住宅/House公建）
	
	//关联的户型表对象
	private HouseTypeModel houseType = null;
	//关联的楼宇表对象
	private BuildingModel building = null;
	
	//关联的客户-房间表类型对象列表
	private List<CustomerHomeModel> customerHomes =null;

}
