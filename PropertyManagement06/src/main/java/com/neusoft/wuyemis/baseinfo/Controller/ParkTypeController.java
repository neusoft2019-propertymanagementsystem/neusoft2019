package com.neusoft.wuyemis.baseinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.baseinfo.service.IParkService;
import com.neusoft.wuyemis.baseinfo.service.IParkTypeService;
import com.neusoft.wuyemis.message.ResultMessage;

@RestController
@RequestMapping(value="parkType")
public class ParkTypeController {
	@Autowired
	private IParkTypeService parkTypeservice = null;
	


}
