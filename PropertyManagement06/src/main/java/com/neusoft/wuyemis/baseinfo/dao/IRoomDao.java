package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.baseinfo.model.RoomModel;
@Mapper

public interface IRoomDao {
	public void create(RoomModel roomModel) throws Exception;
	public void update(RoomModel roomModel) throws Exception;
	public void delete(RoomModel roomModel) throws Exception;
	public List<RoomModel> selectListByAll() throws Exception;
	
	//关联方法
	//

}
