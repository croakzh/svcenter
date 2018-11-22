package com.croakzh.webfront.po;

import com.croakzh.webfront.po.base.PageBean;
import lombok.Data;

import java.io.Serializable;

/**
 * table name : servers, table comment : 监控服务器表
 *
 * @author croakzh
 */
@Data
public class ServersPo extends PageBean implements Serializable {

    /**
     * serialVersionUID 持久化ID
     */
    private static final Long serialVersionUID = 1L;

    /**
     * 服务器id
     */
    private Integer id;

    /**
     * 服务器ip
     */
    private String host;

    /**
     * 服务器名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * ssh用户名
     */
    private String username;

    /**
     * ssh密码
     */
    private String password;

    /**
     * ssh状态 0在线 1离线
     */
    private Byte status;

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
