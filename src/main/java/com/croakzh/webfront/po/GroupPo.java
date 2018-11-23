package com.croakzh.webfront.po;

import com.croakzh.webfront.po.base.PageBean;
import lombok.Data;

import java.io.Serializable;

/**
 * table name : group, table comment : 权限组
 *
 * @author croakzh
 */
@Data
public class GroupPo extends PageBean implements Serializable {

	/**
	 * serialVersionUID 持久化ID
	 */
	private static final Long serialVersionUID = 1L;

	/**
	 * 权限组id,主键
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
	 * 新增时间
	 */
	private String addtime;

	/**
	 * 修改时间
	 */
	private String updatetime;

}
