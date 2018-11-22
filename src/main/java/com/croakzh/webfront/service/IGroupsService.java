package com.croakzh.webfront.service;

import com.croakzh.webfront.po.GroupsPo;
import java.util.List;

/**
 * Service code for the table : groups
 *
 * @author croakzh
 */
public interface IGroupsService {

	/**
	 * 统计实体对象的数量
	 *
	 * @param groups 请求实体参数
	 * @return 统计个数
	 */
	Integer countGroupss(GroupsPo groups);

	/**
	 * 获取所有实体的列表
	 *
	 * @param groups 请求实体参数
	 * @return 表groups的所有的查询列表
	 */
	List<GroupsPo> findAllGroupss(GroupsPo groups);

	/**
	 * 获取实体列表
	 *
	 * @param groups 请求实体参数
	 * @return 表groups的查询列表
	 */
	List<GroupsPo> findGroupssByPage(GroupsPo groups);

	/**
	 * 获得具体的实体
	 *
	 * @param groupid 自增长主键
	 * @return 表groups的具体实体
	 */
	GroupsPo getGroups(Integer groupid);

	/**
	 * 新增数据库实例
	 *
	 * @param groups 请求实体参数
	 * @return 操作成功数
	 */
	Integer addGroups(GroupsPo groups);

	/**
	 * 更新数据库实例
	 *
	 * @param groups 请求实体参数
	 * @return 操作成功数
	 */
	Integer updateGroups(GroupsPo groups);

	/**
	 * 删除数据库实体
	 *
	 * @param groupid 自增长主键
	 * @return 操作成功数
	 */
	Integer deleteGroups(Integer groupid);
}
