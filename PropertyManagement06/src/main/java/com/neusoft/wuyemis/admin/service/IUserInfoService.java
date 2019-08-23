package com.neusoft.wuyemis.admin.service;

import java.util.List;

import com.neusoft.wuyemis.admin.model.UserInfoModel;

/*
 * 模块：admin
 * UserInfo的业务接口
 * @Author: 张云强
 */
public interface IUserInfoService {
	//注册用户
	public void register(UserInfoModel userinfoModel) throws Exception;
	//修改用户
	public void modify(UserInfoModel userinfoModel) throws Exception;
	//修改密码
	public void changePassword(String idString ,String password) throws Exception;
	//修改角色
	public void changeRole(String id,String role) throws Exception;
    //删除
	public void delete(UserInfoModel userinfoModel) throws Exception;
	//取列表
	public List<UserInfoModel> selsetListByAll()throws Exception;
	//
	public UserInfoModel getById(String id) throws Exception;
}
