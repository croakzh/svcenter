package com.croakzh.webfront.po;

import com.croakzh.webfront.po.base.PageBean;
import lombok.Data;

import java.io.Serializable;

/**
 * table name : users, table comment : 登录用户表
 *
 * @author croakzh
 * @since 2018-11-22
 */
@Data
public class UsersPo extends PageBean implements Serializable {

    /**
     * serialVersionUID 持久化ID
     */
    private static final Long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 用户名
     */
    private String loginname;

    /**
     * 密码
     */
    private String password;

    /**
     * 1正常 2停用
     */
    private Byte status;

    /**
     * 登录时间
     */
    private String logintime;

    /**
     * 登录来源
     */
    private String loginip;

    /**
     * 登录状态 0登出 1登录
     */
    private Byte logins;

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
