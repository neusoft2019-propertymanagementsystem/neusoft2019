package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.RoomModel;

public interface IRoomDao {
	public void create(RoomModel roomModel) throws Exception;
	public void update(RoomModel roomModel) throws Exception;
	public void delete(RoomModel roomModel) throws Exception;
	public List<RoomModel> selectListByAll() throws Exception;
	
	//关联方法
	//

}
