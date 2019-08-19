package com.neusoft.wuyemis.feeinfo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.RoomFeeModel;

@Mapper

public interface IRoomFeeDao {

	public void create(RoomFeeModel roomfeeModel) throws Exception;
	
	public void update(RoomFeeModel roomfeeModel) throws Exception;
	
	public void delete(RoomFeeModel roomfeeModel) throws Exception;
	
	public List<RoomFeeModel> selectListByAllWithRoles() throws Exception;

}
