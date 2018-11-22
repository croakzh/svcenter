package com.croakzh.webfront.mapper;

import com.croakzh.webfront.po.GroupsPo;

import java.sql.SQLException;
import java.util.List;

/**
 * Mapper code for the table : groups
 *
 * @author croakzh
 */
public interface GroupsMapper extends ISqlMapper {

    /**
     * 统计实体对象的数量
     *
     * @param groups 操作持久层参数实例
     * @return 统计个数
     */
    Integer countGroupss(GroupsPo groups) throws SQLException;

    /**
     * 获取所有实体的列表
     *
     * @param groups 操作持久层参数实例
     * @return 表groups的所有的查询列表
     */
    List<GroupsPo> findAllGroupss(GroupsPo groups) throws SQLException;

    /**
     * 获取实体列表
     *
     * @param groups 操作持久层参数实例
     * @return 表groups的查询列表
     */
    List<GroupsPo> findGroupssByPage(GroupsPo groups) throws SQLException;

    /**
     * 获得具体的实体
     *
     * @param groupid 自增长主键
     * @return 表groups的具体实体
     */
    GroupsPo getGroups(Integer groupid) throws SQLException;

    /**
     * 新增数据库实例
     *
     * @param groups 操作持久层参数实例
     * @return 操作成功数
     */
    Integer addGroups(GroupsPo groups) throws SQLException;

    /**
     * 更新数据库实例
     *
     * @param groups 操作持久层参数实例
     * @return 操作成功数
     */
    Integer updateGroups(GroupsPo groups) throws SQLException;

    /**
     * 删除数据库实体
     *
     * @param groupid 自增长主键
     * @return 操作成功数
     */
    Integer deleteGroups(Integer groupid) throws SQLException;
}
