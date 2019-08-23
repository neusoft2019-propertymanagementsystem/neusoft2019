package com.neusoft.wuyemis.baseinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.baseinfo.model.ParkModel;
import com.neusoft.wuyemis.baseinfo.service.IParkService;
import com.neusoft.wuyemis.message.ResultMessage;

@RestController
@RequestMapping(value="park")
public class ParkController {
	@Autowired
	private IParkService parkservice = null;
	
	@RequestMapping("/list/all/page")
	public ResultMessage<ParkModel> getListByAllWitPage(@RequestParam(required = false,defaultValue ="10") int rows,@RequestParam(required = false,defaultValue = "1") int page) throws Exception{
		ResultMessage<ParkModel> result = new ResultMessage<ParkModel>("OK","取得小区列表分页模式成功");
		result.setCount(parkservice.getCountByAll());
		result.setPageCount(parkservice.getPagaCountByAll(rows));
		result.setList(parkservice.getListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);
		return result;
	}

}
