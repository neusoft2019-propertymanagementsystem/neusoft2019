package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.ParkFeePayRecordModel;

public interface IParkFeePayRecordDao {
	public void create (ParkFeePayRecordModel parkFeePayRecordModel) throws Exception;
	public void update (ParkFeePayRecordModel parkFeePayRecordModel) throws Exception;
	public void delete (ParkFeePayRecordModel parkFeePayRecordModel) throws Exception;
	public List<ParkFeePayRecordModel> selectListByAll() throws Exception;

}
