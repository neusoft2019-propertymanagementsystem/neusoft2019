package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.RoomFeeModel;
import com.neusoft.wuyemis.security.model.UserModel;

public interface IRoomFeeService {
	
	public void feewrite(RoomFeeModel roomfeeModel) throws Exception;
	
	public void modify(RoomFeeModel roomfeeModel) throws Exception;

	public void delete(RoomFeeModel roomfeeModel) throws Exception; 

	public List<UserModel> getListByAll() throws Exception;

}
