package com.croakzh.webfront.po;

import com.croakzh.webfront.po.base.PageBean;
import lombok.Data;

import java.io.Serializable;

/**
 * table name : log, table comment : 日志存储表
 *
 * @author croakzh
 */
@Data
public class LogPo extends PageBean implements Serializable {

    /**
     * serialVersionUID 持久化ID
     */
    private static final Long serialVersionUID = 1L;

    /**
     * 日志存储id,主键
     */
    private Integer id;

    /**
     * 日志详情
     */
    private String detail;

    /**
     * 服务器id
     */
    private Integer serverid;

    /**
     * 应用id
     */
    private Integer applicationid;

}
