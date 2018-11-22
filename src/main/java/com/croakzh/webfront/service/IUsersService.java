package com.croakzh.webfront.service;

import com.croakzh.webfront.po.UsersPo;
import java.util.List;

/**
 * Service code for the table : users
 *
 * @author croakzh
 */
public interface IUsersService {

	/**
	 * 统计实体对象的数量
	 *
	 * @param users 请求实体参数
	 * @return 统计个数
	 */
	Integer countUserss(UsersPo users);

	/**
	 * 获取所有实体的列表
	 *
	 * @param users 请求实体参数
	 * @return 表users的所有的查询列表
	 */
	List<UsersPo> findAllUserss(UsersPo users);

	/**
	 * 获取实体列表
	 *
	 * @param users 请求实体参数
	 * @return 表users的查询列表
	 */
	List<UsersPo> findUserssByPage(UsersPo users);

	/**
	 * 获得具体的实体
	 *
	 * @param userid 用户id
	 * @return 表users的具体实体
	 */
	UsersPo getUsers(Integer userid);

	/**
	 * 新增数据库实例
	 *
	 * @param users 请求实体参数
	 * @return 操作成功数
	 */
	Integer addUsers(UsersPo users);

	/**
	 * 更新数据库实例
	 *
	 * @param users 请求实体参数
	 * @return 操作成功数
	 */
	Integer updateUsers(UsersPo users);

	/**
	 * 删除数据库实体
	 *
	 * @param userid 用户id
	 * @return 操作成功数
	 */
	Integer deleteUsers(Integer userid);
}
