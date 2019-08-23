package com.neusoft.wuyemis.baseinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.baseinfo.model.BuildingTypeModel;
import com.neusoft.wuyemis.baseinfo.model.RoomModel;
import com.neusoft.wuyemis.baseinfo.service.IRoomService;
import com.neusoft.wuyemis.message.ResultMessage;

@RestController
@RequestMapping(value="room")
public class RoomController {
	@Autowired
	private IRoomService roomeservice = null;
	@RequestMapping("/list/all/page")
	public ResultMessage<RoomModel> getListByAllWitPage(@RequestParam(required = false,defaultValue ="10") int rows,@RequestParam(required = false,defaultValue = "1") int page) throws Exception{
		ResultMessage<RoomModel> result = new ResultMessage<RoomModel>("OK","取得小区列表分页模式成功");
		result.setCount(roomeservice.getCountByAll());
		result.setPageCount(roomeservice.getPagaCountByAll(rows));
		result.setList(roomeservice.getListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);
		return result;
	}
	
	//增加小区
	@RequestMapping("/add")
	public ResultMessage<RoomModel> add(RoomModel room) throws Exception {
		roomeservice.addRoom(room);
		return new ResultMessage<RoomModel>("OK","增加成功");
	}
	//修改部门
	@PostMapping("/modify")
	public ResultMessage<RoomModel> modify(RoomModel room) throws Exception {
		roomeservice.modifyRoom(room);
		return new ResultMessage<RoomModel>("OK","修改成功");
	}
	//删除部门
	@PostMapping("/delete")
	public ResultMessage<RoomModel> delete(RoomModel room) throws Exception {
		roomeservice.deleteRoom(room);
		return new ResultMessage<RoomModel>("OK","删除成功");
	}

}
