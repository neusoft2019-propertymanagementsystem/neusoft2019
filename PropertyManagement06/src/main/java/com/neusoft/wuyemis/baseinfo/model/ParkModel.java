package com.neusoft.wuyemis.baseinfo.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
//车位表
@Data
public class ParkModel {
	private int ParkNO = 0;		//车位序号
	private String ParkCode = null;		//车位编码
	private String Location = null;		//位置
	private BigDecimal Area = null;		//面积
	private String ParkStatus = null;		//是否关联客户(Y/N)
	private String Rentprice= null;		//出租价格
	private String RentUnit= null;		//租赁单位(天,月,季,年)
	private String FeeStatus= null;		//收费状态:Y收费,N:不收费
	
	//关联的车位类型表
	private ParkTypeModel parkType = null;
	
	//关联的楼宇表
	private BuildingModel building = null;
	
	//关联的客户-车位表对象列表
	private List<ParkCustomerModel> parkCustomers = null;
	

}
