package com.neusoft.wuyemis.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.admin.dao.ISystemFunctionDao;
import com.neusoft.wuyemis.admin.model.SystemFunctionModel;
import com.neusoft.wuyemis.admin.service.ISystemFuntionService;

@Service
@Transactional
public class SystemFuntionServiceImpl implements ISystemFuntionService {
	
	@Autowired
	private ISystemFunctionDao systemfuntionDao=null;
	
	@Override
	public void create(SystemFunctionModel systemfuntionModel) throws Exception {
		systemfuntionDao.create(systemfuntionModel);

	}

	@Override
	public void update(SystemFunctionModel systemfuntionModel) throws Exception {
		systemfuntionDao.update(systemfuntionModel);

	}

	@Override
	public void delete(SystemFunctionModel systemfuntionModel) throws Exception {
		systemfuntionDao.delete(systemfuntionModel);

	}

	@Override
	public List<SystemFunctionModel> selsctListByAll() throws Exception {
		
		return systemfuntionDao.selsctListByAll();
	}

}
