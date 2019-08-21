package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.baseinfo.model.ParkCustomerModel;
@Mapper
public interface IParkCustomerDao {
	public void create(ParkCustomerModel parkCustomerModel) throws Exception;
	public void update(ParkCustomerModel parkCustomerModel) throws Exception;
	public void delete(ParkCustomerModel parkCustomerModel) throws Exception;
	public List<ParkCustomerModel> selectListByAll() throws Exception;

}
