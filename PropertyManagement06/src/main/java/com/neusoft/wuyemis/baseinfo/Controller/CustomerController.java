package com.neusoft.wuyemis.baseinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.baseinfo.model.CustomerModel;
import com.neusoft.wuyemis.baseinfo.service.ICustomerService;
import com.neusoft.wuyemis.message.ResultMessage;
@RestController
@RequestMapping(value="customer")
public class CustomerController {
	@Autowired
	private ICustomerService customerservice = null;
	//取得小区列表，带分页
	@RequestMapping(value="/list/all/page")
	public ResultMessage<CustomerModel> getListByAllWitPage(@RequestParam(required = false,defaultValue ="10") int rows,@RequestParam(required = false,defaultValue = "1") int page) throws Exception{
		ResultMessage<CustomerModel> result = new ResultMessage<CustomerModel>("OK","取得小区列表分页模式成功");
		result.setCount(customerservice.getCountByAll());
		result.setPageCount(customerservice.getPagaCountByAll(rows));
		result.setList(customerservice.getListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);
		return result;
	}
	//增加小区
	@RequestMapping("/add")
	public ResultMessage<CustomerModel> add(CustomerModel customer) throws Exception {
		customerservice.addCustomer(customer);
		return new ResultMessage<CustomerModel>("OK","增加部门成功");
	}
	//修改部门
	@PostMapping("/modify")
	public ResultMessage<CustomerModel> modify(CustomerModel customer) throws Exception {
		customerservice.modifyCustomer(customer);
		return new ResultMessage<CustomerModel>("OK","修改部门成功");
	}
	//删除部门
	@PostMapping("/delete")
	public ResultMessage<CustomerModel> delete(CustomerModel customer) throws Exception {
		customerservice.deleteCustomer(customer);
		return new ResultMessage<CustomerModel>("OK","删除部门成功");
	}

}
