package com.neusoft.wuyemis.baseinfo.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//车位客户表
@Data
@Alias("ParkCustomer")
public class ParkCustomerModel implements Serializable{
	private int PCNO = 0;		//车辆客户关联序号
	private String CarCode = null;		//车牌号
	private Date StartDate = null;		//开始日期
	private Date EndDate = null;		//结束日期
	private String PCStatus= null;		//关联状态(Y:正在关联，N:关联解除)
	
	//关联的车位表对象
	private ParkModel park = null;
	//关联的客户表对象
	private CustomerModel customer = null;
	
}
