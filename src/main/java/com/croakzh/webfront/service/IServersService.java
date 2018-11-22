package com.croakzh.webfront.service;

import com.croakzh.webfront.po.ServersPo;
import java.util.List;

/**
 * Service code for the table : servers
 *
 * @author croakzh
 */
public interface IServersService {

	/**
	 * 统计实体对象的数量
	 *
	 * @param servers 请求实体参数
	 * @return 统计个数
	 */
	Integer countServerss(ServersPo servers);

	/**
	 * 获取所有实体的列表
	 *
	 * @param servers 请求实体参数
	 * @return 表servers的所有的查询列表
	 */
	List<ServersPo> findAllServerss(ServersPo servers);

	/**
	 * 获取实体列表
	 *
	 * @param servers 请求实体参数
	 * @return 表servers的查询列表
	 */
	List<ServersPo> findServerssByPage(ServersPo servers);

	/**
	 * 获得具体的实体
	 *
	 * @param id 服务器id
	 * @return 表servers的具体实体
	 */
	ServersPo getServers(Integer id);

	/**
	 * 新增数据库实例
	 *
	 * @param servers 请求实体参数
	 * @return 操作成功数
	 */
	Integer addServers(ServersPo servers);

	/**
	 * 更新数据库实例
	 *
	 * @param servers 请求实体参数
	 * @return 操作成功数
	 */
	Integer updateServers(ServersPo servers);

	/**
	 * 删除数据库实体
	 *
	 * @param id 服务器id
	 * @return 操作成功数
	 */
	Integer deleteServers(Integer id);
}
