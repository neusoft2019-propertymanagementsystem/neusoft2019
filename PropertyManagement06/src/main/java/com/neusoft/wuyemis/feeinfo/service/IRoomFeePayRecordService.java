package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.RoomFeePayRecordModel;

public interface IRoomFeePayRecordService {

	public void add(RoomFeePayRecordModel roomfeepayrecordModel) throws Exception;
	
	public void modify(RoomFeePayRecordModel roomfeepayrecordModel) throws Exception;
	
	public void delete(RoomFeePayRecordModel roomfeepayrecordModel) throws Exception;
	
	public List<RoomFeePayRecordModel> selectListByAll() throws Exception;
	
}
