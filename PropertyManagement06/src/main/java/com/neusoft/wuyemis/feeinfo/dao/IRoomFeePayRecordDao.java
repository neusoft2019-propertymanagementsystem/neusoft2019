package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.RoomFeePayRecordModel;
@Mapper
public interface IRoomFeePayRecordDao {
	
	public void create(RoomFeePayRecordModel roomfeepayrecordModel) throws Exception;

	public void update(RoomFeePayRecordModel roomfeepayrecordModel) throws Exception;

	public void delete(RoomFeePayRecordModel roomfeepayrecordModel) throws Exception;

	public List<RoomFeePayRecordModel> selectListByAllWithRoles() throws Exception;
	
}
