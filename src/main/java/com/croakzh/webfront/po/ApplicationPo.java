package com.croakzh.webfront.po;

import com.croakzh.webfront.po.base.PageBean;
import lombok.Data;

import java.io.Serializable;

/**
 * table name : application, table comment : 应用部署表
 *
 * @author croakzh
 */
@Data
public class ApplicationPo extends PageBean implements Serializable {

    /**
     * serialVersionUID 持久化ID
     */
    private static final Long serialVersionUID = 1L;

    /**
     * 应用id,主键
     */
    private Integer applicationid;

    /**
     * 服务器id
     */
    private Integer serverid;

    /**
     * 应用名称
     */
    private String applicationname;

    /**
     * 应用部署路径
     */
    private String developpath;

    /**
     * 描述
     */
    private String description;

    /**
     * 新增时间
     */
    private String addtime;

    /**
     * 修改时间
     */
    private String updatetime;

}
