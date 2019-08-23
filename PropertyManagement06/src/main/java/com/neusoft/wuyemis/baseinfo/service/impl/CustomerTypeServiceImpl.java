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
		return customerTypedao.selectCountByAll();
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
	public List<CustomerTypeModel> getListByAllWithPage(int rows, int page) throws Exception {
		return customerTypedao.selectListByAllWithPage(rows*(page-1), rows);
	}

}
