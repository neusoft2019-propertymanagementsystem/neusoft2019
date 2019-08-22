package com.neusoft.wuyemis.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.admin.dao.ISystemFunctionUserDao;
import com.neusoft.wuyemis.admin.model.SystemFunctionUserModel;
import com.neusoft.wuyemis.admin.service.ISystemFuntionUserService;
@Service
@Transactional

public class SystemFuntionUserServiceImpl implements ISystemFuntionUserService {
	
	@Autowired
	private ISystemFunctionUserDao systemfuntionuserDao=null;
	
	@Override
	public void create(SystemFunctionUserModel systemfuntionMdoel) throws Exception {
		systemfuntionuserDao.create(systemfuntionMdoel);

	}

	@Override
	public void update(SystemFunctionUserModel systemfuntionMdoel) throws Exception {
		systemfuntionuserDao.update(systemfuntionMdoel);

	}

	@Override
	public void delete(SystemFunctionUserModel systemfuntionMdoel) throws Exception {
		systemfuntionuserDao.delete(systemfuntionMdoel);

	}

	@Override
	public List<SystemFunctionUserModel> selsctListByAll() throws Exception {
		
		return systemfuntionuserDao.selsctListByAll();
	}

}
