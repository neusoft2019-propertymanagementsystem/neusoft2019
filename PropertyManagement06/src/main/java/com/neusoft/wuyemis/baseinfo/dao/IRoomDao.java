package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.CustomerHomeModel;
import com.neusoft.wuyemis.baseinfo.model.RoomModel;
@Mapper

public interface IRoomDao {
	public void insert(RoomModel roomModel) throws Exception;
	public void update(RoomModel roomModel) throws Exception;
	public void delete(RoomModel roomModel) throws Exception;
	public List<RoomModel> selectListByAll() throws Exception;
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<RoomModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;
	
	//关联方法
	//为房间表增加客户-房间表
	public void addCustomerHome() throws Exception;
	//取得指定房间的客户-房间对象
	public List<CustomerHomeModel> selectCustomerHomeByRoom() throws Exception;

}
