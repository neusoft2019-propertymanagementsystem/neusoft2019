package com.neusoft.wuyemis.admin.dao;

import java.util.List;

import com.neusoft.wuyemis.admin.model.UserInfoModel;
/*
 * 模块：admin
 * UserInfo的Dao层接口
 * @Author: 张云强
 */

public interface IUserInfoDao {
	
	public void create(UserInfoModel userInfoMosel) throws Exception;
	
	public void update(UserInfoModel userInfoMosel) throws Exception;
	
	public void delete(UserInfoModel userInfoMosel) throws Exception;
	
	public List<UserInfoModel> selectListByAll() throws Exception;
}
