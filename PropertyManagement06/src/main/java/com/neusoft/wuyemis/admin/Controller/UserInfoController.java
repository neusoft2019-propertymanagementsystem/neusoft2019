package com.neusoft.wuyemis.admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.admin.model.UserInfoModel;
import com.neusoft.wuyemis.admin.service.IUserInfoService;

/*
 * 模块：admin
 * 操作员控制层Controller
 * @Author: 张云强
 */
@RequestMapping
@RestController(value="/userInfo")
public class UserInfoController implements IUserInfoService {
	
	
	@Autowired
	private IUserInfoService userInfoService=null;
	
	@PostMapping("/register")
	public void register(UserInfoModel userinfoModel) throws Exception {



	}

	@PostMapping("/modify")
	public ResultMessage<UserInfoModel> modify(UserInfoModel userinfoModel) throws Exception {
 


	}

	@PostMapping
	public void changePassword(String idString, String password) throws Exception {
		

	}

	@PostMapping
	public void changeRole(String id, String role) throws Exception {
		

	}

	@PostMapping
	public boolean validate(String id, String password) throws Exception {
		
		return false;
	}

	@PostMapping
	public void active(String id) throws Exception {
		

	}

	@PostMapping
	public void delete(UserInfoModel userinfoModel) throws Exception {
		
	}

	@PostMapping
	public List<UserInfoModel> selsetListByAll() throws Exception {
		
		return null;
	}

	@PostMapping
	public UserInfoModel getById(String id) throws Exception {
		
		return null;
	}

}
