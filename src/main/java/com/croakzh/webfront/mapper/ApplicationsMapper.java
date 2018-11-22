package com.croakzh.webfront.mapper;

import com.croakzh.webfront.po.ApplicationsPo;

import java.sql.SQLException;
import java.util.List;

/**
 * Mapper code for the table : applications
 *
 * @author croakzh
 */
public interface ApplicationsMapper extends ISqlMapper {

    /**
     * 统计实体对象的数量
     *
     * @param applications 操作持久层参数实例
     * @return 统计个数
     */
    Integer countApplicationss(ApplicationsPo applications) throws SQLException;

    /**
     * 获取所有实体的列表
     *
     * @param applications 操作持久层参数实例
     * @return 表applications的所有的查询列表
     */
    List<ApplicationsPo> findAllApplicationss(ApplicationsPo applications) throws SQLException;

    /**
     * 获取实体列表
     *
     * @param applications 操作持久层参数实例
     * @return 表applications的查询列表
     */
    List<ApplicationsPo> findApplicationssByPage(ApplicationsPo applications) throws SQLException;

    /**
     * 获得具体的实体
     *
     * @param id 应用id
     * @return 表applications的具体实体
     */
    ApplicationsPo getApplications(Integer id) throws SQLException;

    /**
     * 新增数据库实例
     *
     * @param applications 操作持久层参数实例
     * @return 操作成功数
     */
    Integer addApplications(ApplicationsPo applications) throws SQLException;

    /**
     * 更新数据库实例
     *
     * @param applications 操作持久层参数实例
     * @return 操作成功数
     */
    Integer updateApplications(ApplicationsPo applications) throws SQLException;

    /**
     * 删除数据库实体
     *
     * @param id 应用id
     * @return 操作成功数
     */
    Integer deleteApplications(Integer id) throws SQLException;
}
