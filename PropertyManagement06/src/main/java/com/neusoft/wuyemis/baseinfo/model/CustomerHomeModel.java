package com.neusoft.wuyemis.baseinfo.model;

import lombok.Data;

//客户房间表
@Data
public class CustomerHomeModel {
	private int CHNO = 0;		//客户房间序号
	private int CustomerNo = 0;		//客户号
	private int RoomNo = 0;		//房间号
	private int LivingTypeNo = 0;		//居住类型号
	//private Datetime ReceiveDate = null;		//收房日期
	//private Datetime LiveDate= null;		//入住日期
	//private Datetime FeeStartDate = null;		//缴费开始日期
	//private Datetime FeeEndDate = null;		//缴费结束日期
	private int HumanCount = 0;		//居住人数

}
