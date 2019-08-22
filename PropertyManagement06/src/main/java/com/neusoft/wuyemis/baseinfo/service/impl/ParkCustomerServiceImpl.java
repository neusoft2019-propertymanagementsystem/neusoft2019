package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.IParkCustomerDao;
import com.neusoft.wuyemis.baseinfo.model.ParkCustomerModel;
import com.neusoft.wuyemis.baseinfo.service.IParkCustomerService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class ParkCustomerServiceImpl implements IParkCustomerService {
	@Autowired
	private IParkCustomerDao parkCustomerdao = null;

	@Override
	public void addParkCustomer(ParkCustomerModel parkCustomerModel) throws Exception {
		parkCustomerdao.insert(parkCustomerModel);
		
	}

	@Override
	public void deleteParkCustomer(ParkCustomerModel parkCustomerModel) throws Exception {
		parkCustomerdao.delete(parkCustomerModel);
		
	}

	@Override
	public void modifyParkCustomer(ParkCustomerModel parkCustomerModel) throws Exception {
		parkCustomerdao.delete(parkCustomerModel);
		parkCustomerdao.insert(parkCustomerModel);
		
	}

	@Override
	public List<ParkCustomerModel> selectListByAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountByAll() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPagaCountByAll(int rows) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ParkCustomerModel> getListByAllWithPage(int rows, int page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
