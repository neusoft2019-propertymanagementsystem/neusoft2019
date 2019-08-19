package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.MaintainTypeModel;

public interface IMaintainTypeDao {
	public void create(MaintainTypeModel maintainTypeModel) throws Exception;
	public void update(MaintainTypeModel maintainTypeModel) throws Exception;
	public void delete(MaintainTypeModel maintainTypeModel) throws Exception;
	public List<MaintainTypeModel> selectListByAll() throws Exception;

}
