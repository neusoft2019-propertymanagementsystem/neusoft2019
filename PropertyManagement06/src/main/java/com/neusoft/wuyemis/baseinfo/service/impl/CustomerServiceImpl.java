package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.ICustomerDao;
import com.neusoft.wuyemis.baseinfo.model.CustomerModel;
import com.neusoft.wuyemis.baseinfo.service.ICustomerService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerDao customerdao = null;
	@Override
	public void addCustomer(CustomerModel customerModel) throws Exception {
		customerdao.insert(customerModel);
		
	}

	@Override
	public void deleteCustomer(CustomerModel customerModel) throws Exception {
		customerdao.delete(customerModel);
		
	}

	@Override
	public void modifyCustomer(CustomerModel customerModel) throws Exception {
		customerdao.delete(customerModel);
		customerdao.insert(customerModel);
		
		
	}

	@Override
	public List<CustomerModel> selectListByAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountByAll() throws Exception {
		return customerdao.selectCountByAll();
	}

	@Override
	public int getPagaCountByAll(int rows) throws Exception {
		int pageCount=0;
		int count=this.getCountByAll();
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		return pageCount;
	}

	@Override
	public List<CustomerModel> getListByAllWithPage(int rows, int page) throws Exception {
		return customerdao.selectListByAllWithPage(rows*(page-1), rows);
	}

}
