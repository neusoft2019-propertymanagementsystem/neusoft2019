package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.RoomFeePayRecordModel;

public interface IRoomFeePayRecordDao {
	public void create (RoomFeePayRecordModel roomFeePayRecordModel) throws Exception;
	public void update (RoomFeePayRecordModel roomFeePayRecordModel) throws Exception;
	public void delete (RoomFeePayRecordModel roomFeePayRecordModel) throws Exception;
	public List<RoomFeePayRecordModel> selectListByAll() throws Exception;

}
