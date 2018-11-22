package com.croakzh.webfront.po;

import com.croakzh.webfront.po.base.PageBean;
import lombok.Data;

import java.io.Serializable;

/**
 * table name : groups, table comment : 权限组
 *
 * @author croakzh
 */
@Data
public class GroupsPo extends PageBean implements Serializable {

    /**
     * serialVersionUID 持久化ID
     */
    private static final Long serialVersionUID = 1L;

    /**
     * 自增长主键
     */
    private Integer groupid;

    /**
     * 权限组名称
     */
    private String groupname;

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

}
