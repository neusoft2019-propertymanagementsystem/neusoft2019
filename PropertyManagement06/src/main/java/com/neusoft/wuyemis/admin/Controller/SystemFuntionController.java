package com.neusoft.wuyemis.admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.admin.dao.ISystemFunctionDao;
import com.neusoft.wuyemis.admin.model.SystemFunctionModel;
import com.neusoft.wuyemis.admin.service.ISystemFuntionService;
/*
 * 模块：admin
 *SystemFuntion控制层Controller
 * @Author: 张云强
 */
@RequestMapping
@RestController
public class SystemFuntionController implements ISystemFunctionDao {

	@Autowired
	private ISystemFuntionService systemFuntionService=null;
	
	@GetMapping
	public void create(SystemFunctionModel systemfuntionModel) throws Exception {
		
	}

	@GetMapping
	public void update(SystemFunctionModel systemfuntionModel) throws Exception {
	

	}

	@GetMapping
	public void delete(SystemFunctionModel systemfuntionModel) throws Exception {
		

	}

	@GetMapping(value="/get/list")
	public List<SystemFunctionModel> selsctListByAll() throws Exception {
		return systemFuntionService.selsctListByAll();
	}

}
