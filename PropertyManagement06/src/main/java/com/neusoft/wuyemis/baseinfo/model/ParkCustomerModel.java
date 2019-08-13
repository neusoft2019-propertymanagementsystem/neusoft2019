package com.neusoft.wuyemis.baseinfo.model;

import java.util.Date;

//车位客户表
public class ParkCustomerModel {
	private int PCNO = 0;		//车辆客户关联序号
	private int ParkNo = 0;		//车位号
	private int CustomerNo = 0;		//客户号
	private String CarCode = null;		//车牌号
	private Date StartDate = null;		//开始日期
	private Date EndDate = null;		//结束日期
	private String PCStatus= null;		//关联状态(Y:正在关联，N:关联解除)	
	
}