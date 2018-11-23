package com.croakzh.webfront.po;

import com.croakzh.webfront.po.base.PageBean;
import lombok.Data;

import java.io.Serializable;

/**
 * table name : server, table comment : 监控服务器表
 *
 * @author croakzh
 */
@Data
public class ServerPo extends PageBean implements Serializable {

    /**
     * serialVersionUID 持久化ID
     */
    private static final Long serialVersionUID = 1L;

    /**
     * 服务器id,主键
     */
    private Integer serverid;

    /**
     * 机器组id
     */
    private Integer groupid;

    /**
     * 服务器ip
     */
    private String host;

    /**
     * 服务器名称
     */
    private String hostname;

    /**
     * 描述
     */
    private String description;

    /**
     * ssh用户名
     */
    private String sshname;

    /**
     * ssh密码
     */
    private String sshpwd;

    /**
     * ssh状态 0在线 1离线
     */
    private Byte status;

    /**
     * 新增时间
     */
    private String addtime;

    /**
     * 修改时间
     */
    private String updatetime;

}
