package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.CustomerHomeModel;
import com.neusoft.wuyemis.baseinfo.model.LivingTypeModel;
@Mapper
public interface ILivingTypeDao {
	public void insert(LivingTypeModel livingTypeModel) throws Exception;
	public void update(LivingTypeModel livingTypeModel) throws Exception;
	public void delete(LivingTypeModel livingTypeModel) throws Exception;
	public List<LivingTypeModel> selectListByAll() throws Exception;
	
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<LivingTypeModel> selectListByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得总数
	public int selectCountByAll() throws Exception;
	
	//为居住类型增加客户-房间表
	public void addCustomerHome() throws Exception;
	//取得指定居住类型的客户-房间表
	public List<CustomerHomeModel> selectCustomerHomeByLivingType() throws Exception;

}
