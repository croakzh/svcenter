package com.croakzh.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 服务器登录信息
 *
 * @author croakzh
 */
@Data
@AllArgsConstructor
public class ServerVo {

    /**
     * 服务器ip
     */
    private String ip;

    /**
     * 服务器登录用户名
     */
    private String username;

    /**
     * 服务器登录密码
     */
    private String password;

}
