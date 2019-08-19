package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.ParkTypeModel;

public interface IParkTypeDao {
	public void create(ParkTypeModel parkTypeModel) throws Exception;
	public void update(ParkTypeModel parkTypeModel) throws Exception;
	public void delete(ParkTypeModel parkTypeModel) throws Exception;
	public List<ParkTypeModel> selectListByAll() throws Exception;

}
