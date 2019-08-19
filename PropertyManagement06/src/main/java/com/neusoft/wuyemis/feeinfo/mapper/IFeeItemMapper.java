package com.neusoft.wuyemis.feeinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.feeinfo.model.FeeItemModel;
@Mapper
public interface IFeeItemMapper {
	public void insert(FeeItemModel behave) throws Exception;
	//修改
	public void update(FeeItemModel behave) throws Exception;
	//删除
	public void delete(FeeItemModel behave) throws Exception;
	//取得角色单个对象
	public FeeItemModel selectByNo(int no) throws Exception;
	//取得所有角色列表
	public List<FeeItemModel> selectListByAll() throws Exception;
	//取得所有角色列表,分页模式
	public List<FeeItemModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得角色的个数
	public int selectCountByAll() throws Exception;
}
