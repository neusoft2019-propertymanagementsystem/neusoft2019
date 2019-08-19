package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.ParkFeeModel;

public interface IParkFeeDao {
	public void create (ParkFeeModel parkFeeModel) throws Exception;
	public void update (ParkFeeModel parkFeeModel) throws Exception;
	public void delete (ParkFeeModel parkFeeModel) throws Exception;
	public List<ParkFeeModel> selectListByAll() throws Exception;

}
