package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.ServiceModel;

public interface IServiceDao {
	public void create(ServiceModel serviceModel) throws Exception;
	public void update(ServiceModel serviceModel) throws Exception;
	public void delete(ServiceModel serviceModel) throws Exception;
	public List<ServiceModel> selectListByAll() throws Exception;

}
