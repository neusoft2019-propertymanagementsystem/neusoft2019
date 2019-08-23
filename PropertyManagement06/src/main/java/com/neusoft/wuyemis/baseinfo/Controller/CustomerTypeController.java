package com.neusoft.wuyemis.baseinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.baseinfo.model.CustomerTypeModel;
import com.neusoft.wuyemis.baseinfo.service.ICustomerTypeService;
import com.neusoft.wuyemis.message.ResultMessage;

@RestController
@RequestMapping(value="customer")
public class CustomerTypeController {
	@Autowired
	private ICustomerTypeService customerTypeservice = null;
	
	//取得列表，带分页
	@RequestMapping(value="/list/all/page")
	public ResultMessage<CustomerTypeModel> getListByAllWitPage(@RequestParam(required = false,defaultValue ="10") int rows,@RequestParam(required = false,defaultValue = "1") int page) throws Exception{
		ResultMessage<CustomerTypeModel> result = new ResultMessage<CustomerTypeModel>("OK","取得列表分页模式成功");
		result.setCount(customerTypeservice.getCountByAll());
		result.setPageCount(customerTypeservice.getPagaCountByAll(rows));
		result.setList(customerTypeservice.getListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);
		return result;
	}  
	//增加
	@RequestMapping("/add")
	public ResultMessage<CustomerTypeModel> add(CustomerTypeModel customer) throws Exception {
		customerTypeservice.addCustomerType(customer);
		return new ResultMessage<CustomerTypeModel>("OK","增加成功");
	}
	//修改
	@PostMapping("/modify")
	public ResultMessage<CustomerTypeModel> modify(CustomerTypeModel customer) throws Exception {
		customerTypeservice.modifyCustomerType(customer);
		return new ResultMessage<CustomerTypeModel>("OK","修改成功");
	}
	//删除
	@PostMapping("/delete")
	public ResultMessage<CustomerTypeModel> delete(CustomerTypeModel customer) throws Exception {
		customerTypeservice.deleteCustomerType(customer);
		return new ResultMessage<CustomerTypeModel>("OK","删除成功");
	}

}
