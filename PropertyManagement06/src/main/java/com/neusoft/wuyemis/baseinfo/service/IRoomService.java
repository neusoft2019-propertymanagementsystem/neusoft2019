package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.RoomModel;

public interface IRoomService {
	//增加
	public void addRoom(RoomModel roomModel) throws Exception;
	//删除
	public void deleteRoom(RoomModel parkTypeModel)throws Exception;
	//修改
	public void modifyRoom(RoomModel parkTypeModel)throws Exception;

	//取得所有的列表
	public List<RoomModel> selectListByAll() throws Exception;
	//取得个数
	public int getCountByAll() throws Exception;
	//取得页数
	public int getPagaCountByAll(int rows) throws Exception;
	//
	public List<RoomModel> getListByAllWithPage(int rows,int page) throws Exception;

}
