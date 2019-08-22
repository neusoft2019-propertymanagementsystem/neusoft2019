package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.ICustomerHomeDao;
import com.neusoft.wuyemis.baseinfo.model.CustomerHomeModel;
import com.neusoft.wuyemis.baseinfo.service.ICustomerHomeService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class CustomerHomeServiceImpl implements ICustomerHomeService {
	@Autowired
	private ICustomerHomeDao customerHomedao = null;
	//增加
	@Override
	public void addCustomerHome(CustomerHomeModel customerHomeModel) throws Exception {
		customerHomedao.insert(customerHomeModel);
		
	}
	//删除
	@Override
	public void deleteCustomerHome(CustomerHomeModel customerHomeModel) throws Exception {
		customerHomedao.delete(customerHomeModel);
		
	}
	//修改
	@Override
	public void modifyCustomerHome(CustomerHomeModel customerHomeModel) throws Exception {
		customerHomedao.delete(customerHomeModel);
		customerHomedao.insert(customerHomeModel);
		
		
	}

	@Override
	public List<CustomerHomeModel> selectListByAll() throws Exception {
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
	public List<CustomerHomeModel> getListByAllWithPage(int rows, int page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
