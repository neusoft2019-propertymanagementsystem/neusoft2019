package com.neusoft.wuyemis.baseinfo.model;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//楼宇表
@Data
@Alias("Building")
public class BuildingModel {
	private int BuildingNO = 0;		//序号pk
	private String BCODE = null;		//楼号
	private String BAddress = null;		//楼宇地址
	private String Direction = null;		//楼宇朝向
	private int TotalHome= 0;		//居民数
	private int TotalHouse= 0;		//公建数
	
	//关联的小区对象
	private AreaModel area = null;
	//关联的建筑类型对象
	private BuildingTypeModel buildingType = null;
	
	//关联的房间表对象列表
	private List<RoomModel> rooms=null;
	
	//关联的车位表类型列表
	private List<ParkModel> parks =null;

}
