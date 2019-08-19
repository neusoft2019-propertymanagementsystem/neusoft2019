package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.ParkFeeModel;

public interface IParkFeeService {
	public void create(ParkFeeModel parkfeeModel) throws Exception;
	
	public void update(ParkFeeModel parkfeeModel) throws Exception;
	
	public void delete(ParkFeeModel parkfeeModel) throws Exception;
	
	public List<ParkFeeModel> selectListByAll() throws Exception; 

}
