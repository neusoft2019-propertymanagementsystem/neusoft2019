package com.neusoft.wuyemis.baseinfo.model;

import java.util.Date;

import lombok.Data;

//客户房间表
@Data
public class CustomerHomeModel {
	private int CHNO = 0;		//客户房间序号
	private Date ReceiveDate = null;		//收房日期
	private Date LiveDate= null;		//入住日期
	private Date FeeStartDate = null;		//缴费开始日期
	private Date FeeEndDate = null;		//缴费结束日期

	//private Datetime ReceiveDate = null;		//收房日期
	//private Datetime LiveDate= null;		//入住日期
	//private Datetime FeeStartDate = null;		//缴费开始日期
	//private Datetime FeeEndDate = null;		//缴费结束日期
	private int HumanCount = 0;		//居住人数
	
	//关联的客户表对象
	private CustomerModel customer = null;
	//关联的房间表对象
	private RoomModel room = null;
	//关联的居住类型表对象
	private LivingTypeModel livingType = null;
}
