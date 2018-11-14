package com.croakzh.service;

import com.croakzh.entity.CpuInfo;
import com.croakzh.entity.vo.ServerVo;

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
