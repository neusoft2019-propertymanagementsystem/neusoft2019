package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.MaintainProviderModel;

public interface IMaintainProviderDao {
	public void create(MaintainProviderModel maintainProviderModel) throws Exception;
	public void update(MaintainProviderModel maintainProviderModel) throws Exception;
	public void delete(MaintainProviderModel maintainProviderModel) throws Exception;
	public List<MaintainProviderModel> selectListByAll() throws Exception;

}
