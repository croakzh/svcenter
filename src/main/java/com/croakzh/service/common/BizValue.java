package com.croakzh.service.common;

public class BizValue {
    public final static int SYSTEM_DEFAULT_KEY_START = 1000;

    // 用户相关
    public final static String INIT_PASSWORD = "123456";
    public final static int CHECKCODE_VALID_DURATION = 5; // 校验码有效时间5分钟

    // 超级管理员
    public final static int USERID_ADMIN = 1; // 超级用户
    public final static int ROLEID_ADMIN = 1;

    //后台用户用户类型
    public final static int USERTYPE_ADMIN = 1;

    // 账号停用、激活状态
    public final static int USER_STATUS_NOACTIVE = 1;
    public final static int USER_STATUS_ACTIVE = 2;
    public final static int USER_STATUS_BLOCK = 3;

    // 用户登录登出状态
    public final static int USER_LOGIN_NO = 0;
    public final static int USER_LOGIN_YES = 1;

    // 系统版本类型
    public final static int VERSION_OSTYPE_WINDOWS = 1;//
    public final static int VERSION_OSTYPE_ANDROID = 2;
    public final static int VERSION_OSTYPE_IOS = 3;


    public final static int VERSION_ADD = 0;// 新增的版本
    public final static int VERSION_INUSE = 1;// 当前在用的版本
    public final static int VERSION_DELETE = 2;

    // bug状态 1未解决2待审核3已拒绝4已解决5已关闭6暂时挂起
    public final static int BUG_STATUS_UNSOLVED = 1;
    public final static int BUG_STATUS_VERIFY = 2;
    public final static int BUG_STATUS_REJECT = 3;
    public final static int BUG_STATUS_DONE = 4;
    public final static int BUG_STATUS_CLOSE = 5;
    public final static int BUG_STATUS_HANGUP = 6;


    /**
     * 组织名称, token算法需要
     */
    public static final String GROUP_NAME = "www.xxx.group";
}
