package com.neusoft.wuyemis.feeinfo.model;

import java.math.BigDecimal;
import java.util.Date;

import com.neusoft.wuyemis.feeinfo.dao.IRoomFeeDao;

//房间缴费表
public class RoomFeeModel {
	private int RoomFeeNo = 0;		//缴费序号
	private String FeeYEAR = null;		//缴费年份
	private String FeeMonth = null;		//缴费月份
	private int RoomNo = 0;		//房间序号
	private int FeeItemNo = 0;		//缴费项目号
	private BigDecimal SPay = null;		//应缴费金额
	private BigDecimal APay = null;		//实缴费金额
	private BigDecimal Derate = null;		//减免金额
	private Date StartDate = null;		//开始日期
	private Date EndDate = null;		//截止日期
	private String FeeStatus = null;		//缴费状态(Y/N)
	public int getClass(Class<IRoomFeeDao> class1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
