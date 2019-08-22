package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.ICustomerTypeDao;
import com.neusoft.wuyemis.baseinfo.model.CustomerTypeModel;
import com.neusoft.wuyemis.baseinfo.service.ICustomerTypeService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class CustomerTypeServiceImpl implements ICustomerTypeService {
	@Autowired
	private ICustomerTypeDao customerTypedao = null;

	@Override
	public void addCustomerType(CustomerTypeModel customerTypeModel) throws Exception {
		customerTypedao.insert(customerTypeModel);
		
	}

	@Override
	public void deleteCustomerType(CustomerTypeModel customerTypeModel) throws Exception {
		customerTypedao.delete(customerTypeModel);
		
	}

	@Override
	public void modifyCustomerType(CustomerTypeModel customerTypeModel) throws Exception {
		customerTypedao.delete(customerTypeModel);
		customerTypedao.insert(customerTypeModel);
		
	}

	@Override
	public List<CustomerTypeModel> selectListByAll() throws Exception {
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
	public List<CustomerTypeModel> getListByAllWithPage(int rows, int page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
