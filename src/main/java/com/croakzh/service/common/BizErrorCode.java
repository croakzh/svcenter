package com.croakzh.service.common;

public class BizErrorCode {

    public final static Integer EX_TRANSACTION_FAIL = -1;

    // 查询失败
    public final static Integer EX_RECORD_NOTEXIST = -100;

    // 增删改失败
    public final static Integer EX_ADD_FAIL = -111;
    public final static Integer EX_UPDATE_FAIL = -112;
    public final static Integer EX_DELETE_FAIL = -113;
    public final static Integer EX_NAME_EXIST = -114; // 名称已经存在
    public final static Integer EX_KEY_INUSE = -115; // 关联主键正在使用
    public final static Integer EX_NAME_CONFLICT = -116; // 名字冲突
    public final static Integer EX_KEY_INVALID = -117; // 关联主键失效
    public final static Integer EX_UPLOAD_FAIL = -118; // 上传失败
    public final static Integer EX_USED = -119;//已被使用

    // 请求参数
    public final static Integer EX_REQUEST_INVALID_PARAM = -200;//请求参数错误

    // 用户
    public final static Integer EX_USER_WRONGPASSWORD = -502; // 密码错误
    public final static Integer EX_USER_BYLOGOUT = -503; // 被注销
    public final static Integer EX_USER_BYLOGIN = -504; // 已经登录
    public final static Integer EX_USER_NOREGISTER = -505; // 用户未注册
    public final static Integer EX_USER_CHECKCODEINVALID = -506; // 验证码错误
    public final static Integer EX_USER_CHECKCODEINLIMIT = -507; // 验证码过期
    public final static Integer EX_USER_BLOCKED = -508; // 停用
    public final static Integer EX_USER_NOACTIVE = -509; // 未激活
    public final static Integer EX_USER_LOGINFAIL = -511; // 登陆失败
    public final static Integer EX_USER_ACTIVEFAIL = -512; // 激活失败
    public final static Integer EX_USER_NOTALLOWED = -521; // 不允许的操作
    public final static Integer EX_USER_EASEMOB = -522; // 注册环信失败
    public final static Integer EX_USER_BALANCE = -523; // 用户余额不足
    public final static Integer EX_USER_REPEAT = -524; // 不能重复操作

    public final static Integer EX_PUSH_RUNNING = -801; //

}
