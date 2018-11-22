package com.croakzh.webfront.service.impl;

import com.croakzh.service.common.BizCache;
import com.croakzh.service.common.BizErrorCode;
import com.croakzh.service.common.BizException;
import com.croakzh.webfront.service.IGroupsService;
import com.croakzh.webfront.mapper.GroupsMapper;
import com.croakzh.webfront.po.GroupsPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;


/**
 * ServiceImpl code for the table : groups
 *
 * @author croakzh
 */
@Service("groupsService")
@Slf4j
public class GroupsServiceImpl implements IGroupsService {

    /**
     * groups表持久层接口
     */
    @Autowired
    @Qualifier("groupsMapper")
    private GroupsMapper groupsMapper;

    /**
     * 统计实体对象的数量
     *
     * @param groups 请求实体参数
     * @return 统计个数
     */
    @Override
    public Integer countGroupss(GroupsPo groups) {
        log.debug("countGroupss starting...");
        int count;
        try {
            count = groupsMapper.countGroupss(groups);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("countGroupss end.");
        return count;
    }

    /**
     * 统计实体对象的数量
     *
     * @param groups 请求实体参数
     * @return 统计个数
     */
    @Override
    public List<GroupsPo> findAllGroupss(GroupsPo groups) {
        log.debug("findAllGroupss starting...");
        List<GroupsPo> groupss;
        try {
            groupss = groupsMapper.findAllGroupss(groups);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("findAllGroupss end.");
        return groupss;
    }

    /**
     * 统计实体对象的数量
     *
     * @param groups 请求实体参数
     * @return 统计个数
     */
    @Override
    public List<GroupsPo> findGroupssByPage(GroupsPo groups) {
        log.debug("findGroupssByPage starting...");
        List<GroupsPo> groupss;
        try {
            groupss = groupsMapper.findGroupssByPage(groups);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("findGroupssByPage end.");
        return groupss;
    }

    /**
     * 获得具体的实体
     *
     * @param groupid 自增长主键
     * @return 表groups的具体实体
     */
    @Override
    public GroupsPo getGroups(Integer groupid) {
        log.debug("getGroups starting...");
        GroupsPo groups;
        try {
            groups = groupsMapper.getGroups(groupid);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("getGroups end.");
        return groups;
    }

    /**
     * 新增实体
     *
     * @param groups 请求实体参数
     * @return 操作成功数
     */
    @Override
    public Integer addGroups(GroupsPo groups) {
        log.debug("addGroups starting...");
        Integer retval;
        try {
            groups.setAddtime(BizCache.getInstance().getNow());
            retval = groupsMapper.addGroups(groups);
            if (retval == 0) {
                throw new BizException(BizErrorCode.EX_ADD_FAIL);
            }
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("addGroups end.");
        return retval;
    }

    /**
     * 更新实体
     *
     * @param groups 请求实体参数
     * @return 操作成功数
     */
    @Override
    public Integer updateGroups(GroupsPo groups) {
        log.debug("updateGroups starting...");
        Integer retval;
        try {
            retval = groupsMapper.updateGroups(groups);
            if (retval == 0) {
                throw new BizException(BizErrorCode.EX_ADD_FAIL);
            }
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("updateGroups end.");
        return retval;
    }

    /**
     * 删除指定对象
     *
     * @param groupid 自增长主键
     * @return 操作成功数
     */
    @Override
    public Integer deleteGroups(Integer groupid) {
        log.debug("deleteGroups starting...");
        Integer retval;
        try {
            retval = groupsMapper.deleteGroups(groupid);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("deleteGroups end.");
        return retval;
    }
}
