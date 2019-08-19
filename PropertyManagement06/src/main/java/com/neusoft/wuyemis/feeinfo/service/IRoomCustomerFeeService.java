package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.RoomCustomerFeeModel;

public interface IRoomCustomerFeeService {

	public void add(RoomCustomerFeeModel roomcustomerfeeModel) throws Exception;
	
	public void modify(RoomCustomerFeeModel roomcustomerfeeModel) throws Exception;
	
	public void delete(RoomCustomerFeeModel roomcustomerfeeModel) throws Exception;
	
	public List<RoomCustomerFeeModel> selectListByAll() throws Exception;
	
	
}
