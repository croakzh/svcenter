package com.croakzh.webfront.po;

import com.croakzh.webfront.po.base.PageBean;
import lombok.Data;

import java.io.Serializable;

/**
 * table name : applications, table comment : 应用部署表
 *
 * @author croakzh
 */
@Data
public class ApplicationsPo extends PageBean implements Serializable {

    /**
     * serialVersionUID 持久化ID
     */
    private static final Long serialVersionUID = 1L;

    /**
     * 应用id
     */
    private Integer id;

    /**
     * 应用名称
     */
    private String name;

    /**
     * 应用部署路径
     */
    private String path;

    /**
     * 描述
     */
    private String description;

    /**
     * 新增人(管理员)
     */
    private Integer adduser;

    /**
     * 新增时间
     */
    private String addtime;

    /**
     * 修改人
     */
    private Integer updateuser;

    /**
     * 修改时间
     */
    private String updatetime;

}
