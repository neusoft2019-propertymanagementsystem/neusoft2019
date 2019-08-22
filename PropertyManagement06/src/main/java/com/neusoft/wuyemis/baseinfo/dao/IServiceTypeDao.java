package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.baseinfo.model.ServiceTypeModel;
@Mapper
public interface IServiceTypeDao {
	public void create(ServiceTypeModel serviceTypeModel) throws Exception;
	public void update(ServiceTypeModel serviceTypeModel) throws Exception;
	public void delete(ServiceTypeModel serviceTypeModel) throws Exception;
	public List<ServiceTypeModel> selectListByAll() throws Exception;

}
