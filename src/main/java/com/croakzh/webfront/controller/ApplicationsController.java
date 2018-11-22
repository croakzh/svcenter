package com.croakzh.webfront.controller;

import com.croakzh.controller.base.BaseCtrl;
import com.croakzh.controller.model.RSResult;
import com.croakzh.service.common.BizException;
import com.croakzh.webfront.po.ApplicationsPo;
import com.croakzh.webfront.service.IApplicationsService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Controller code for the table : applications
 *
 * @author croakzh
 * @since 2018-11-22
 */
@Controller
@RequestMapping("/applications")
@Slf4j
public class ApplicationsController extends BaseCtrl {

	/**
	 * applications表业务层接口
	 */
	@Autowired
	@Qualifier("applicationsService")
	private IApplicationsService applicationsService;

	/**
	 * 查询所有实体对象的数量
	 *
	 * @param applications 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/count")
	@ResponseBody
	public RSResult count(@RequestBody ApplicationsPo applications) {
		log.info("Start get the count of the table : applications, the request is : {}", applications);
		RSResult result = new RSResult();
		try {
			int count = applicationsService.countApplicationss(applications);
			result.setResult(0);
			result.setData(count);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get the count of the table : applications, success.");
		return result;
	}

	/**
	 * 查询所有实体对象
	 *
	 * @param applications 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/list")
	@ResponseBody
	public RSResult list(@RequestBody ApplicationsPo applications) {
		log.info("Start get list of the table : applications, the request is : {}", applications);
		RSResult result = new RSResult();
		try {
			int count = applicationsService.countApplicationss(applications);
			List<ApplicationsPo> list = new ArrayList<>();
			if (count > 0) {
				applications.setPagestart((applications.getCurpage() - 1) * applications.getPagesize());
				list = applicationsService.findApplicationssByPage(applications);
			}
			result.setResult(0);
			result.setTotal(count);
			result.setData(list);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get list of the table : applications, success.");
		return result;
	}

	/**
	 * 查看具体的实体
	 *
	 * @param applications 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/detail")
	@ResponseBody
	public RSResult info(@RequestBody ApplicationsPo applications) {
		log.info("Get detail object of the table : applications, the request is : {}", applications);
		RSResult result = new RSResult();
		try {
			ApplicationsPo obj = applicationsService.getApplications(applications.getId());
			result.setResult(0);
			result.setData(obj);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get detail object of the table : applications, success.");
		return result;
	}

	/**
	 * 新增对象实体
	 *
	 * @param applications 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/new")
	@ResponseBody
	public RSResult add(@RequestBody ApplicationsPo applications) {
		log.info("Add object to the table : applications, the request is : {}", applications);
		RSResult result = new RSResult();
		try {
			Integer id = applicationsService.addApplications(applications);
			result.setResult(0);
			result.setData(id);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Add object to the table : applications, success.");
		return result;
	}

	/**
	 * 更新对象实体
	 *
	 * @param applications 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/update")
	@ResponseBody
	public RSResult update(@RequestBody ApplicationsPo applications) {
		log.info("Update object from the table : applications, the request is : {}", applications);
		RSResult result = new RSResult();
		try {
			applicationsService.updateApplications(applications);
			result.setResult(0);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Update object from the table : applications, success.");
		return result;
	}

	/**
	 * 删除对象实体
	 *
	 * @param applications 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/delete")
	@ResponseBody
	public RSResult delete(@RequestBody ApplicationsPo applications) {
		log.info("Delete object from the table : applications, the request is : {}", applications);
		RSResult result = new RSResult();
		try {
			applicationsService.deleteApplications(applications.getId());
			result.setResult(0);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Delete object from the table : applications, success.");
		return result;
	}
}
