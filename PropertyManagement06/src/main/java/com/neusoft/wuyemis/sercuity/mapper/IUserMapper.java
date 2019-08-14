package com.neusoft.wuyemis.sercuity.mapper;

import java.util.List;
import com.neusoft.wuyemis.security.model.UserModel;

//用户DAO层

public interface IUserMapper {
	
	public void create(UserModel userModel) throws Exception;
	
	public void update(UserModel userModel) throws Exception;
	
	public void delete(UserModel userModel) throws Exception;
	
	public List<UserModel> selectListByAll(UserModel userModel) throws Exception;
	//查询返回单个对象，一般根据表的主键字段值获取
	public UserModel selectById(String id) throws Exception;
	
}
