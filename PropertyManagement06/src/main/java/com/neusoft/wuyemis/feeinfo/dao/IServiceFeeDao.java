package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.ServiceFeeModel;

public interface IServiceFeeDao {
	public void create (ServiceFeeModel serviceFeeModel) throws Exception;
	public void update (ServiceFeeModel serviceFeeModel) throws Exception;
	public void delete (ServiceFeeModel serviceFeeModel) throws Exception;
	public List<ServiceFeeModel> selectListByAll() throws Exception;

}
