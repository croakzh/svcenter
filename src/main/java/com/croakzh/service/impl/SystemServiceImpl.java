package com.croakzh.service.impl;

import com.croakzh.core.context.ActionContext;
import com.croakzh.core.entity.CpuInfo;
import com.croakzh.core.entity.vo.ServerVo;
import com.croakzh.service.ISystemService;
import com.jcraft.jsch.Session;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author croakzh
 */
@Service
@Slf4j
public class SystemServiceImpl implements ISystemService {

    /**
     * 获得服务器CPU详情
     *
     * @param serverVo 参数
     * @return {@link CpuInfo}
     */
    @Override
    public CpuInfo getCpuInfo(ServerVo serverVo) {
        String host = serverVo.getHost();
        Session session = ActionContext.getSession(host);

        return null;
    }
}
