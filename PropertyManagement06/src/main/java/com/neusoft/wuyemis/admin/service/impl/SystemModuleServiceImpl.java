package com.neusoft.wuyemis.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.admin.dao.ISystemModuleDao;
import com.neusoft.wuyemis.admin.model.SystemModuleModel;
import com.neusoft.wuyemis.admin.service.ISystemModuleService;
@Service
@Transactional
public class SystemModuleServiceImpl implements ISystemModuleService {
	@Autowired
	private ISystemModuleDao systemModuleDao=null; 
	
	@Override
	public void create(SystemModuleModel systemModuleModel) throws Exception {
		systemModuleDao.create(systemModuleModel);

	}

	@Override
	public void update(SystemModuleModel systemModuleModel) throws Exception {
		systemModuleDao.update(systemModuleModel);

	}

	@Override
	public void delete(SystemModuleModel systemModuleModel) throws Exception {
		systemModuleDao.delete(systemModuleModel);
	}

	@Override
	public List<SystemModuleModel> selsctListByAll() throws Exception {
		
		return systemModuleDao.selsctListByAll();
	}

}
