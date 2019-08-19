package com.neusoft.wuyemis.feeinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.feeinfo.model.RoomFeeModel;

public interface IRoomFeeMapper {

	public void insert(RoomFeeModel behave) throws Exception;
	//修改
	public void update(RoomFeeModel behave) throws Exception;
	//删除
	public void delete(RoomFeeModel behave) throws Exception;
	//取得角色单个对象
	public RoomFeeModel selectByNo(int no) throws Exception;
	//取得所有角色列表
	public List<RoomFeeModel> selectListByAll() throws Exception;
	//取得所有角色列表,分页模式
	public List<RoomFeeModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得角色的个数
	public int selectCountByAll() throws Exception;
}
