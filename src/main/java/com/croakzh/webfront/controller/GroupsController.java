package com.croakzh.webfront.controller;

import com.croakzh.controller.base.BaseCtrl;
import com.croakzh.controller.model.RSResult;
import com.croakzh.service.common.BizException;
import com.croakzh.webfront.po.GroupsPo;
import com.croakzh.webfront.service.IGroupsService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Controller code for the table : groups
 *
 * @author croakzh
 * @since 2018-11-22
 */
@Controller
@RequestMapping("/groups")
@Slf4j
public class GroupsController extends BaseCtrl {

	/**
	 * groups表业务层接口
	 */
	@Autowired
	@Qualifier("groupsService")
	private IGroupsService groupsService;

	/**
	 * 查询所有实体对象的数量
	 *
	 * @param groups 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/count")
	@ResponseBody
	public RSResult count(@RequestBody GroupsPo groups) {
		log.info("Start get the count of the table : groups, the request is : {}", groups);
		RSResult result = new RSResult();
		try {
			int count = groupsService.countGroupss(groups);
			result.setResult(0);
			result.setData(count);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get the count of the table : groups, success.");
		return result;
	}

	/**
	 * 查询所有实体对象
	 *
	 * @param groups 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/list")
	@ResponseBody
	public RSResult list(@RequestBody GroupsPo groups) {
		log.info("Start get list of the table : groups, the request is : {}", groups);
		RSResult result = new RSResult();
		try {
			int count = groupsService.countGroupss(groups);
			List<GroupsPo> list = new ArrayList<>();
			if (count > 0) {
				groups.setPagestart((groups.getCurpage() - 1) * groups.getPagesize());
				list = groupsService.findGroupssByPage(groups);
			}
			result.setResult(0);
			result.setTotal(count);
			result.setData(list);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get list of the table : groups, success.");
		return result;
	}

	/**
	 * 查看具体的实体
	 *
	 * @param groups 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/detail")
	@ResponseBody
	public RSResult info(@RequestBody GroupsPo groups) {
		log.info("Get detail object of the table : groups, the request is : {}", groups);
		RSResult result = new RSResult();
		try {
			GroupsPo obj = groupsService.getGroups(groups.getGroupid());
			result.setResult(0);
			result.setData(obj);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get detail object of the table : groups, success.");
		return result;
	}

	/**
	 * 新增对象实体
	 *
	 * @param groups 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/new")
	@ResponseBody
	public RSResult add(@RequestBody GroupsPo groups) {
		log.info("Add object to the table : groups, the request is : {}", groups);
		RSResult result = new RSResult();
		try {
			Integer id = groupsService.addGroups(groups);
			result.setResult(0);
			result.setData(id);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Add object to the table : groups, success.");
		return result;
	}

	/**
	 * 更新对象实体
	 *
	 * @param groups 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/update")
	@ResponseBody
	public RSResult update(@RequestBody GroupsPo groups) {
		log.info("Update object from the table : groups, the request is : {}", groups);
		RSResult result = new RSResult();
		try {
			groupsService.updateGroups(groups);
			result.setResult(0);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Update object from the table : groups, success.");
		return result;
	}

	/**
	 * 删除对象实体
	 *
	 * @param groups 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/delete")
	@ResponseBody
	public RSResult delete(@RequestBody GroupsPo groups) {
		log.info("Delete object from the table : groups, the request is : {}", groups);
		RSResult result = new RSResult();
		try {
			groupsService.deleteGroups(groups.getGroupid());
			result.setResult(0);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Delete object from the table : groups, success.");
		return result;
	}
}
