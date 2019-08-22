package com.neusoft.wuyemis.baseinfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.baseinfo.model.AreaModel;
import com.neusoft.wuyemis.baseinfo.service.IAreaService;


@RestController
@RequestMapping("/api/user")
public class AreaAPIController {
	@Autowired
	private IAreaService AreaService = null;
	
	@RequestMapping(value="/list")	
	public List<AreaModel> getUserList() throws Exception{
		System.out.println(AreaService);
		return AreaService.selectListByAll();
	}

}
