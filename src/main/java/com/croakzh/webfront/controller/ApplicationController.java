package com.croakzh.webfront.controller;

import java.util.ArrayList;
import java.util.List;

import com.croakzh.controller.base.BaseCtrl;
import com.croakzh.controller.model.RSResult;
import com.croakzh.service.common.BizException;
import com.croakzh.webfront.po.ApplicationPo;
import com.croakzh.webfront.service.IApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Controller code for the table : application
 *
 * @author croakzh
 * @since 2018-11-23
 */
@Controller
@RequestMapping("/application")
@Slf4j
public class ApplicationController extends BaseCtrl {

	/**
	 * application表业务层接口
	 */
	@Autowired
	@Qualifier("applicationService")
	private IApplicationService applicationService;

	/**
	 * 查询所有实体对象的数量
	 *
	 * @param application 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/count")
	@ResponseBody
	public RSResult count(@RequestBody ApplicationPo application) {
		log.info("Start get the count of the table : application, the request is : {}", application);
		RSResult result = new RSResult();
		try {
			int count = applicationService.countApplications(application);
			result.setResult(0);
			result.setData(count);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get the count of the table : application, success.");
		return result;
	}

	/**
	 * 查询所有实体对象
	 *
	 * @param application 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/list")
	@ResponseBody
	public RSResult list(@RequestBody ApplicationPo application) {
		log.info("Start get list of the table : application, the request is : {}", application);
		RSResult result = new RSResult();
		try {
			int count = applicationService.countApplications(application);
			List<ApplicationPo> list = new ArrayList<>();
			if (count > 0) {
				application.setPagestart((application.getCurpage() - 1) * application.getPagesize());
				list = applicationService.findApplicationsByPage(application);
			}
			result.setResult(0);
			result.setTotal(count);
			result.setData(list);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get list of the table : application, success.");
		return result;
	}

	/**
	 * 查看具体的实体
	 *
	 * @param application 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/detail")
	@ResponseBody
	public RSResult info(@RequestBody ApplicationPo application) {
		log.info("Get detail object of the table : application, the request is : {}", application);
		RSResult result = new RSResult();
		try {
			ApplicationPo obj = applicationService.getApplication(application.getApplicationid());
			result.setResult(0);
			result.setData(obj);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Get detail object of the table : application, success.");
		return result;
	}

	/**
	 * 新增对象实体
	 *
	 * @param application 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/new")
	@ResponseBody
	public RSResult add(@RequestBody ApplicationPo application) {
		log.info("Add object to the table : application, the request is : {}", application);
		RSResult result = new RSResult();
		try {
			Integer id = applicationService.addApplication(application);
			result.setResult(0);
			result.setData(id);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Add object to the table : application, success.");
		return result;
	}

	/**
	 * 更新对象实体
	 *
	 * @param application 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/update")
	@ResponseBody
	public RSResult update(@RequestBody ApplicationPo application) {
		log.info("Update object from the table : application, the request is : {}", application);
		RSResult result = new RSResult();
		try {
			applicationService.updateApplication(application);
			result.setResult(0);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Update object from the table : application, success.");
		return result;
	}

	/**
	 * 删除对象实体
	 *
	 * @param application 请求实体参数
	 * @return {@link RSResult} rest返回值
	 */
	@PostMapping(value= "/delete")
	@ResponseBody
	public RSResult delete(@RequestBody ApplicationPo application) {
		log.info("Delete object from the table : application, the request is : {}", application);
		RSResult result = new RSResult();
		try {
			applicationService.deleteApplication(application.getApplicationid());
			result.setResult(0);
		} catch (BizException ex) {
			log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
			result.setResult(ex.getErrorcode(), ex.getDescription());
		}
		log.info("Delete object from the table : application, success.");
		return result;
	}
}
