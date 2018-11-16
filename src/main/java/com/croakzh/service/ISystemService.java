package com.croakzh.service;

import com.croakzh.core.entity.CpuInfo;
import com.croakzh.core.entity.vo.ServerVo;

/**
 * @author croakzh
 */
public interface ISystemService {

    /**
     * 获取具体的cpu属性
     *
     * @param serverVo
     * @return
     */
    CpuInfo getCpuInfo(ServerVo serverVo);

}
