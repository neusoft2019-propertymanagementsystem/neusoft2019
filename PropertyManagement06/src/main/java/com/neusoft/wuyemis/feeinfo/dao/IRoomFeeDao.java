package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.RoomFeeModel;

public interface IRoomFeeDao {
	public void create (RoomFeeModel roomFeeModel) throws Exception;
	public void update (RoomFeeModel roomFeeModel) throws Exception;
	public void delete (RoomFeeModel roomFeeModel) throws Exception;
	public List<RoomFeeModel> selectListByAll() throws Exception;

}
