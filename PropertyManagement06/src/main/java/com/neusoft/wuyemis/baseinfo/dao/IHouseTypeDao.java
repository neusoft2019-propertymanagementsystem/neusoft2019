package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.HouseTypeModel;

public interface IHouseTypeDao {
	public void create(HouseTypeModel houseTypeModel) throws Exception;
	public void update(HouseTypeModel houseTypeModel) throws Exception;
	public void delete(HouseTypeModel houseTypeModel) throws Exception;
	public List<HouseTypeModel> selectListByAll() throws Exception;

}
