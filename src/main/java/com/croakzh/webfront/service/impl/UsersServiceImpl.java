package com.croakzh.webfront.service.impl;

import com.croakzh.service.common.BizCache;
import com.croakzh.service.common.BizErrorCode;
import com.croakzh.service.common.BizException;
import com.croakzh.webfront.service.IUsersService;
import com.croakzh.webfront.mapper.UsersMapper;
import com.croakzh.webfront.po.UsersPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * ServiceImpl code for the table : users
 *
 * @author croakzh
 */
@Service("usersService")
@Slf4j
public class UsersServiceImpl implements IUsersService {

    /**
     * users表持久层接口
     */
    @Autowired
    @Qualifier("usersMapper")
    private UsersMapper usersMapper;

    /**
     * 统计实体对象的数量
     *
     * @param users 请求实体参数
     * @return 统计个数
     */
    @Override
    public Integer countUserss(UsersPo users) {
        log.debug("countUserss starting...");
        int count;
        try {
            count = usersMapper.countUserss(users);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("countUserss end.");
        return count;
    }

    /**
     * 统计实体对象的数量
     *
     * @param users 请求实体参数
     * @return 统计个数
     */
    @Override
    public List<UsersPo> findAllUserss(UsersPo users) {
        log.debug("findAllUserss starting...");
        List<UsersPo> userss;
        try {
            userss = usersMapper.findAllUserss(users);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("findAllUserss end.");
        return userss;
    }

    /**
     * 统计实体对象的数量
     *
     * @param users 请求实体参数
     * @return 统计个数
     */
    @Override
    public List<UsersPo> findUserssByPage(UsersPo users) {
        log.debug("findUserssByPage starting...");
        List<UsersPo> userss;
        try {
            userss = usersMapper.findUserssByPage(users);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("findUserssByPage end.");
        return userss;
    }

    /**
     * 获得具体的实体
     *
     * @param userid 用户id
     * @return 表users的具体实体
     */
    @Override
    public UsersPo getUsers(Integer userid) {
        log.debug("getUsers starting...");
        UsersPo users;
        try {
            users = usersMapper.getUsers(userid);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("getUsers end.");
        return users;
    }

    /**
     * 新增实体
     *
     * @param users 请求实体参数
     * @return 操作成功数
     */
    @Override
    public Integer addUsers(UsersPo users) {
        log.debug("addUsers starting...");
        Integer retval;
        try {
            users.setAddtime(BizCache.getInstance().getNow());
            retval = usersMapper.addUsers(users);
            if (retval == 0) {
                throw new BizException(BizErrorCode.EX_ADD_FAIL);
            }
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("addUsers end.");
        return retval;
    }

    /**
     * 更新实体
     *
     * @param users 请求实体参数
     * @return 操作成功数
     */
    @Override
    public Integer updateUsers(UsersPo users) {
        log.debug("updateUsers starting...");
        Integer retval;
        try {
            users.setUpdatetime(BizCache.getInstance().getNow());
            retval = usersMapper.updateUsers(users);
            if (retval == 0) {
                throw new BizException(BizErrorCode.EX_ADD_FAIL);
            }
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("updateUsers end.");
        return retval;
    }

    /**
     * 删除指定对象
     *
     * @param userid 用户id
     * @return 操作成功数
     */
    @Override
    public Integer deleteUsers(Integer userid) {
        log.debug("deleteUsers starting...");
        Integer retval;
        try {
            retval = usersMapper.deleteUsers(userid);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("deleteUsers end.");
        return retval;
    }
}
