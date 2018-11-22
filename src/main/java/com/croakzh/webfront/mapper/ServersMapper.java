package com.croakzh.webfront.mapper;

import com.croakzh.webfront.po.ServersPo;

import java.sql.SQLException;
import java.util.List;

/**
 * Mapper code for the table : servers
 *
 * @author croakzh
 */
public interface ServersMapper extends ISqlMapper {

    /**
     * 统计实体对象的数量
     *
     * @param servers 操作持久层参数实例
     * @return 统计个数
     */
    Integer countServerss(ServersPo servers) throws SQLException;

    /**
     * 获取所有实体的列表
     *
     * @param servers 操作持久层参数实例
     * @return 表servers的所有的查询列表
     */
    List<ServersPo> findAllServerss(ServersPo servers) throws SQLException;

    /**
     * 获取实体列表
     *
     * @param servers 操作持久层参数实例
     * @return 表servers的查询列表
     */
    List<ServersPo> findServerssByPage(ServersPo servers) throws SQLException;

    /**
     * 获得具体的实体
     *
     * @param id 服务器id
     * @return 表servers的具体实体
     */
    ServersPo getServers(Integer id) throws SQLException;

    /**
     * 新增数据库实例
     *
     * @param servers 操作持久层参数实例
     * @return 操作成功数
     */
    Integer addServers(ServersPo servers) throws SQLException;

    /**
     * 更新数据库实例
     *
     * @param servers 操作持久层参数实例
     * @return 操作成功数
     */
    Integer updateServers(ServersPo servers) throws SQLException;

    /**
     * 删除数据库实体
     *
     * @param id 服务器id
     * @return 操作成功数
     */
    Integer deleteServers(Integer id) throws SQLException;
}
