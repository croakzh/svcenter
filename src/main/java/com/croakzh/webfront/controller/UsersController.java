package com.croakzh.webfront.controller;

import com.croakzh.controller.base.BaseCtrl;
import com.croakzh.controller.model.RSResult;
import com.croakzh.service.common.BizException;
import com.croakzh.webfront.po.UsersPo;
import com.croakzh.webfront.service.IUsersService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Controller code for the table : users
 *
 * @author croakzh
 * @since 2018-11-22
 */
@Controller
@RequestMapping("/users")
@Slf4j
public class UsersController extends BaseCtrl {

	/**
	 * users表业务层接口
	 */
	@Autowired
	@Qualifier("usersService")
	private IUsersService usersService;

	/**
	 * 查询所有实体对象的数量
	 *
	 * @param users 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/count")
	@ResponseBody
	public RSResult count(@RequestBody UsersPo users) {
		log.info("Start get the count of the table : users, the request is : {}", users);
		RSResult result = new RSResult();
		try {
			int count = usersService.countUserss(users);
			result.setResult(0);
			result.setData(count);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get the count of the table : users, success.");
		return result;
	}

	/**
	 * 查询所有实体对象
	 *
	 * @param users 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/list")
	@ResponseBody
	public RSResult list(@RequestBody UsersPo users) {
		log.info("Start get list of the table : users, the request is : {}", users);
		RSResult result = new RSResult();
		try {
			int count = usersService.countUserss(users);
			List<UsersPo> list = new ArrayList<>();
			if (count > 0) {
				users.setPagestart((users.getCurpage() - 1) * users.getPagesize());
				list = usersService.findUserssByPage(users);
			}
			result.setResult(0);
			result.setTotal(count);
			result.setData(list);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get list of the table : users, success.");
		return result;
	}

	/**
	 * 查看具体的实体
	 *
	 * @param users 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/detail")
	@ResponseBody
	public RSResult info(@RequestBody UsersPo users) {
		log.info("Get detail object of the table : users, the request is : {}", users);
		RSResult result = new RSResult();
		try {
			UsersPo obj = usersService.getUsers(users.getUserid());
			result.setResult(0);
			result.setData(obj);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get detail object of the table : users, success.");
		return result;
	}

	/**
	 * 新增对象实体
	 *
	 * @param users 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/new")
	@ResponseBody
	public RSResult add(@RequestBody UsersPo users) {
		log.info("Add object to the table : users, the request is : {}", users);
		RSResult result = new RSResult();
		try {
			Integer id = usersService.addUsers(users);
			result.setResult(0);
			result.setData(id);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Add object to the table : users, success.");
		return result;
	}

	/**
	 * 更新对象实体
	 *
	 * @param users 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/update")
	@ResponseBody
	public RSResult update(@RequestBody UsersPo users) {
		log.info("Update object from the table : users, the request is : {}", users);
		RSResult result = new RSResult();
		try {
			usersService.updateUsers(users);
			result.setResult(0);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Update object from the table : users, success.");
		return result;
	}

	/**
	 * 删除对象实体
	 *
	 * @param users 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/delete")
	@ResponseBody
	public RSResult delete(@RequestBody UsersPo users) {
		log.info("Delete object from the table : users, the request is : {}", users);
		RSResult result = new RSResult();
		try {
			usersService.deleteUsers(users.getUserid());
			result.setResult(0);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Delete object from the table : users, success.");
		return result;
	}
}
