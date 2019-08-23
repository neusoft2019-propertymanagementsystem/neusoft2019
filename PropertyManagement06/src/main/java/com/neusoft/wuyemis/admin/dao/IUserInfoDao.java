package com.neusoft.wuyemis.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.admin.model.UserInfoModel;
import com.neusoft.wuyemis.baseinfo.model.AreaModel;
import com.neusoft.wuyemis.baseinfo.model.BuildingModel;
/*
 * 模块：admin
 * UserInfo的Dao层接口
 * @Author: 张云强
 */
@Mapper
public interface IUserInfoDao {
	
	public void create(UserInfoModel userInfoMosel) throws Exception;
	
	public void update(UserInfoModel userInfoMosel) throws Exception;
	
	public void delete(UserInfoModel userInfoMosel) throws Exception;
	
	    //返回列表
		public List<UserInfoModel> selectListByAll() throws Exception;
		//返回带分页的列表 star:起始的记录号 rows:取得的个数
		public List<UserInfoModel> selectListByAllWithPage(int star, int rows) throws Exception;
		//返回单个
		public UserInfoModel selectListById(String UUSERID) throws Exception;
		
}