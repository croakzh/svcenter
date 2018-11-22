package com.croakzh.webfront.service;

import com.croakzh.webfront.po.ApplicationsPo;
import java.util.List;

/**
 * Service code for the table : applications
 *
 * @author croakzh
 */
public interface IApplicationsService {

	/**
	 * 统计实体对象的数量
	 *
	 * @param applications 请求实体参数
	 * @return 统计个数
	 */
	Integer countApplicationss(ApplicationsPo applications);

	/**
	 * 获取所有实体的列表
	 *
	 * @param applications 请求实体参数
	 * @return 表applications的所有的查询列表
	 */
	List<ApplicationsPo> findAllApplicationss(ApplicationsPo applications);

	/**
	 * 获取实体列表
	 *
	 * @param applications 请求实体参数
	 * @return 表applications的查询列表
	 */
	List<ApplicationsPo> findApplicationssByPage(ApplicationsPo applications);

	/**
	 * 获得具体的实体
	 *
	 * @param id 应用id
	 * @return 表applications的具体实体
	 */
	ApplicationsPo getApplications(Integer id);

	/**
	 * 新增数据库实例
	 *
	 * @param applications 请求实体参数
	 * @return 操作成功数
	 */
	Integer addApplications(ApplicationsPo applications);

	/**
	 * 更新数据库实例
	 *
	 * @param applications 请求实体参数
	 * @return 操作成功数
	 */
	Integer updateApplications(ApplicationsPo applications);

	/**
	 * 删除数据库实体
	 *
	 * @param id 应用id
	 * @return 操作成功数
	 */
	Integer deleteApplications(Integer id);
}
