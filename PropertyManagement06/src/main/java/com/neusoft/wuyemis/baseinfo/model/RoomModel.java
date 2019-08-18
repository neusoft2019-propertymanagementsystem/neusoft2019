package com.neusoft.wuyemis.baseinfo.model;

import lombok.Data;

//房间表
@Data
public class RoomModel {
	private int ROOMNO = 0;		//房间编号
	private int HouseTypeNo = 0;		//房屋户型编号
	private int BuildingNo= 0;		//楼宇编号
	private String DepartmentCode= null;		//单元
	private String Floor= null;		//楼层
	private String RoomCode= null;		//房间号
	private String BuildingArea = null;		//使用面积
	private String FeeArea = null;		//缴费面积
	private String RoomStatus = null;		//房间状态（空闲/入住）
	private String RoomType= null;		//房间类型（room:住宅/House公建）

}
