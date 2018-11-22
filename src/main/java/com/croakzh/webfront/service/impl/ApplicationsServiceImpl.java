package com.croakzh.webfront.service.impl;

import com.croakzh.service.common.BizCache;
import com.croakzh.service.common.BizErrorCode;
import com.croakzh.service.common.BizException;
import com.croakzh.webfront.service.IApplicationsService;
import com.croakzh.webfront.mapper.ApplicationsMapper;
import com.croakzh.webfront.po.ApplicationsPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * ServiceImpl code for the table : applications
 *
 * @author croakzh
 */
@Service("applicationsService")
@Slf4j
public class ApplicationsServiceImpl implements IApplicationsService {

    /**
     * applications表持久层接口
     */
    @Autowired
    @Qualifier("applicationsMapper")
    private ApplicationsMapper applicationsMapper;

    /**
     * 统计实体对象的数量
     *
     * @param applications 请求实体参数
     * @return 统计个数
     */
    @Override
    public Integer countApplicationss(ApplicationsPo applications) {
        log.debug("countApplicationss starting...");
        int count;
        try {
            count = applicationsMapper.countApplicationss(applications);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("countApplicationss end.");
        return count;
    }

    /**
     * 统计实体对象的数量
     *
     * @param applications 请求实体参数
     * @return 统计个数
     */
    @Override
    public List<ApplicationsPo> findAllApplicationss(ApplicationsPo applications) {
        log.debug("findAllApplicationss starting...");
        List<ApplicationsPo> applicationss;
        try {
            applicationss = applicationsMapper.findAllApplicationss(applications);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("findAllApplicationss end.");
        return applicationss;
    }

    /**
     * 统计实体对象的数量
     *
     * @param applications 请求实体参数
     * @return 统计个数
     */
    @Override
    public List<ApplicationsPo> findApplicationssByPage(ApplicationsPo applications) {
        log.debug("findApplicationssByPage starting...");
        List<ApplicationsPo> applicationss;
        try {
            applicationss = applicationsMapper.findApplicationssByPage(applications);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("findApplicationssByPage end.");
        return applicationss;
    }

    /**
     * 获得具体的实体
     *
     * @param id 应用id
     * @return 表applications的具体实体
     */
    @Override
    public ApplicationsPo getApplications(Integer id) {
        log.debug("getApplications starting...");
        ApplicationsPo applications;
        try {
            applications = applicationsMapper.getApplications(id);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("getApplications end.");
        return applications;
    }

    /**
     * 新增实体
     *
     * @param applications 请求实体参数
     * @return 操作成功数
     */
    @Override
    public Integer addApplications(ApplicationsPo applications) {
        log.debug("addApplications starting...");
        Integer retval;
        try {
            applications.setAddtime(BizCache.getInstance().getNow());
            retval = applicationsMapper.addApplications(applications);
            if (retval == 0) {
                throw new BizException(BizErrorCode.EX_ADD_FAIL);
            }
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("addApplications end.");
        return retval;
    }

    /**
     * 更新实体
     *
     * @param applications 请求实体参数
     * @return 操作成功数
     */
    @Override
    public Integer updateApplications(ApplicationsPo applications) {
        log.debug("updateApplications starting...");
        Integer retval;
        try {
            applications.setUpdatetime(BizCache.getInstance().getNow());
            retval = applicationsMapper.updateApplications(applications);
            if (retval == 0) {
                throw new BizException(BizErrorCode.EX_ADD_FAIL);
            }
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("updateApplications end.");
        return retval;
    }

    /**
     * 删除指定对象
     *
     * @param id 应用id
     * @return 操作成功数
     */
    @Override
    public Integer deleteApplications(Integer id) {
        log.debug("deleteApplications starting...");
        Integer retval;
        try {
            retval = applicationsMapper.deleteApplications(id);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_TRANSACTION_FAIL);
        }
        log.debug("deleteApplications end.");
        return retval;
    }
}
