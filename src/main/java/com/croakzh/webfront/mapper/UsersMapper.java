package com.croakzh.webfront.mapper;

import com.croakzh.webfront.po.UsersPo;

import java.sql.SQLException;
import java.util.List;

/**
 * Mapper code for the table : users
 *
 * @author croakzh
 */
public interface UsersMapper extends ISqlMapper {

    /**
     * 统计实体对象的数量
     *
     * @param users 操作持久层参数实例
     * @return 统计个数
     */
    Integer countUserss(UsersPo users) throws SQLException;

    /**
     * 获取所有实体的列表
     *
     * @param users 操作持久层参数实例
     * @return 表users的所有的查询列表
     */
    List<UsersPo> findAllUserss(UsersPo users) throws SQLException;

    /**
     * 获取实体列表
     *
     * @param users 操作持久层参数实例
     * @return 表users的查询列表
     */
    List<UsersPo> findUserssByPage(UsersPo users) throws SQLException;

    /**
     * 获得具体的实体
     *
     * @param userid 用户id
     * @return 表users的具体实体
     */
    UsersPo getUsers(Integer userid) throws SQLException;

    /**
     * 新增数据库实例
     *
     * @param users 操作持久层参数实例
     * @return 操作成功数
     */
    Integer addUsers(UsersPo users) throws SQLException;

    /**
     * 更新数据库实例
     *
     * @param users 操作持久层参数实例
     * @return 操作成功数
     */
    Integer updateUsers(UsersPo users) throws SQLException;

    /**
     * 删除数据库实体
     *
     * @param userid 用户id
     * @return 操作成功数
     */
    Integer deleteUsers(Integer userid) throws SQLException;
}
