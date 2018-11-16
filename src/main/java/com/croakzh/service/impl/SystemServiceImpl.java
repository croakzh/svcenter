package com.croakzh.service.impl;

import com.croakzh.core.entity.CpuInfo;
import com.croakzh.core.entity.vo.ServerVo;
import com.croakzh.service.ISystemService;
import org.springframework.stereotype.Service;

/**
 * @author croakzh
 */
@Service
public class SystemServiceImpl implements ISystemService {

    /**
     * 获得服务器CPU详情
     *
     * @param serverVo 参数
     * @return {@link CpuInfo}
     */
    @Override
    public CpuInfo getCpuInfo(ServerVo serverVo) {
        return null;
    }
}
