package com.croakzh.webfront.service.impl;

import com.croakzh.service.common.BizCache;
import com.croakzh.service.common.BizErrorCode;
import com.croakzh.service.common.BizException;
import com.croakzh.webfront.service.IServersService;
import com.croakzh.webfront.mapper.ServersMapper;
import com.croakzh.webfront.po.ServersPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * ServiceImpl code for the table : servers
 *
 * @author croakzh
 */
@Service("serversService")
@Slf4j
public class ServersServiceImpl implements IServersService {

    /**
     * servers表持久层接口
     */
    @Autowired
    @Qualifier("serversMapper")
    private ServersMapper serversMapper;

    /**
     * 统计实体对象的数量
     *
     * @param servers 请求实体参数
     * @return 统计个数
     */
    @Override
    public Integer countServerss(ServersPo servers) {
        log.debug("countServerss starting...");
        int count;
        try {
            count = serversMapper.countServerss(servers);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("countServerss end.");
        return count;
    }

    /**
     * 统计实体对象的数量
     *
     * @param servers 请求实体参数
     * @return 统计个数
     */
    @Override
    public List<ServersPo> findAllServerss(ServersPo servers) {
        log.debug("findAllServerss starting...");
        List<ServersPo> serverss;
        try {
            serverss = serversMapper.findAllServerss(servers);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("findAllServerss end.");
        return serverss;
    }

    /**
     * 统计实体对象的数量
     *
     * @param servers 请求实体参数
     * @return 统计个数
     */
    @Override
    public List<ServersPo> findServerssByPage(ServersPo servers) {
        log.debug("findServerssByPage starting...");
        List<ServersPo> serverss;
        try {
            serverss = serversMapper.findServerssByPage(servers);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("findServerssByPage end.");
        return serverss;
    }

    /**
     * 获得具体的实体
     *
     * @param id 服务器id
     * @return 表servers的具体实体
     */
    @Override
    public ServersPo getServers(Integer id) {
        log.debug("getServers starting...");
        ServersPo servers;
        try {
            servers = serversMapper.getServers(id);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("getServers end.");
        return servers;
    }

    /**
     * 新增实体
     *
     * @param servers 请求实体参数
     * @return 操作成功数
     */
    @Override
    public Integer addServers(ServersPo servers) {
        log.debug("addServers starting...");
        Integer retval;
        try {
            servers.setAddtime(BizCache.getInstance().getNow());
            retval = serversMapper.addServers(servers);
            if (retval == 0) {
                throw new BizException(BizErrorCode.EX_ADD_FAIL);
            }
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("addServers end.");
        return retval;
    }

    /**
     * 更新实体
     *
     * @param servers 请求实体参数
     * @return 操作成功数
     */
    @Override
    public Integer updateServers(ServersPo servers) {
        log.debug("updateServers starting...");
        Integer retval;
        try {
            servers.setUpdatetime(BizCache.getInstance().getNow());
            retval = serversMapper.updateServers(servers);
            if (retval == 0) {
                throw new BizException(BizErrorCode.EX_ADD_FAIL);
            }
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("updateServers end.");
        return retval;
    }

    /**
     * 删除指定对象
     *
     * @param id 服务器id
     * @return 操作成功数
     */
    @Override
    public Integer deleteServers(Integer id) {
        log.debug("deleteServers starting...");
        Integer retval;
        try {
            retval = serversMapper.deleteServers(id);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("deleteServers end.");
        return retval;
    }
}
