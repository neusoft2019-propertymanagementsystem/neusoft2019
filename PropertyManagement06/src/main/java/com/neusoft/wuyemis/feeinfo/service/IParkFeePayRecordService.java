package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.ParkFeePayRecordModel;

public interface IParkFeePayRecordService {
	public void create(ParkFeePayRecordModel parkfeepayrecordModel) throws Exception;
	
	public void update(ParkFeePayRecordModel parkfeepayrecordModel) throws Exception;
	
	public void delete(ParkFeePayRecordModel parkfeepayrecordModel) throws Exception;
	
	public List<ParkFeePayRecordModel> selectListByAll() throws Exception; 

}
