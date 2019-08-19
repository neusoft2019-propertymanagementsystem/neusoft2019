package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.RoomCustomerFeeModel;


@Mapper
public interface IRoomCustomerFeeDao {

	public void create(RoomCustomerFeeModel roomcustomerfeeModel) throws Exception;
	
	public void updete(RoomCustomerFeeModel roomcustomerfeeModel) throws Exception;
	
	public void delete(RoomCustomerFeeModel roomcustomerfeeModel) throws Exception;
	
	public List<RoomCustomerFeeModel> seleceListByAll() throws Exception;
	
}
