package com.croakzh.webfront.controller;

import com.croakzh.controller.base.BaseCtrl;
import com.croakzh.controller.model.RSResult;
import com.croakzh.service.common.BizException;
import com.croakzh.webfront.po.ServersPo;
import com.croakzh.webfront.service.IServersService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Controller code for the table : servers
 *
 * @author croakzh
 * @since 2018-11-22
 */
@Controller
@RequestMapping("/servers")
@Slf4j
public class ServersController extends BaseCtrl {

	/**
	 * servers表业务层接口
	 */
	@Autowired
	@Qualifier("serversService")
	private IServersService serversService;

	/**
	 * 查询所有实体对象的数量
	 *
	 * @param servers 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/count")
	@ResponseBody
	public RSResult count(@RequestBody ServersPo servers) {
		log.info("Start get the count of the table : servers, the request is : {}", servers);
		RSResult result = new RSResult();
		try {
			int count = serversService.countServerss(servers);
			result.setResult(0);
			result.setData(count);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get the count of the table : servers, success.");
		return result;
	}

	/**
	 * 查询所有实体对象
	 *
	 * @param servers 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/list")
	@ResponseBody
	public RSResult list(@RequestBody ServersPo servers) {
		log.info("Start get list of the table : servers, the request is : {}", servers);
		RSResult result = new RSResult();
		try {
			int count = serversService.countServerss(servers);
			List<ServersPo> list = new ArrayList<>();
			if (count > 0) {
				servers.setPagestart((servers.getCurpage() - 1) * servers.getPagesize());
				list = serversService.findServerssByPage(servers);
			}
			result.setResult(0);
			result.setTotal(count);
			result.setData(list);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get list of the table : servers, success.");
		return result;
	}

	/**
	 * 查看具体的实体
	 *
	 * @param servers 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/detail")
	@ResponseBody
	public RSResult info(@RequestBody ServersPo servers) {
		log.info("Get detail object of the table : servers, the request is : {}", servers);
		RSResult result = new RSResult();
		try {
			ServersPo obj = serversService.getServers(servers.getId());
			result.setResult(0);
			result.setData(obj);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get detail object of the table : servers, success.");
		return result;
	}

	/**
	 * 新增对象实体
	 *
	 * @param servers 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/new")
	@ResponseBody
	public RSResult add(@RequestBody ServersPo servers) {
		log.info("Add object to the table : servers, the request is : {}", servers);
		RSResult result = new RSResult();
		try {
			Integer id = serversService.addServers(servers);
			result.setResult(0);
			result.setData(id);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Add object to the table : servers, success.");
		return result;
	}

	/**
	 * 更新对象实体
	 *
	 * @param servers 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/update")
	@ResponseBody
	public RSResult update(@RequestBody ServersPo servers) {
		log.info("Update object from the table : servers, the request is : {}", servers);
		RSResult result = new RSResult();
		try {
			serversService.updateServers(servers);
			result.setResult(0);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Update object from the table : servers, success.");
		return result;
	}

	/**
	 * 删除对象实体
	 *
	 * @param servers 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/delete")
	@ResponseBody
	public RSResult delete(@RequestBody ServersPo servers) {
		log.info("Delete object from the table : servers, the request is : {}", servers);
		RSResult result = new RSResult();
		try {
			serversService.deleteServers(servers.getId());
			result.setResult(0);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Delete object from the table : servers, success.");
		return result;
	}
}
