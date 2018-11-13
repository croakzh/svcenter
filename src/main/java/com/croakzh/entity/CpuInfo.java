package com.croakzh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Cpu信息
 *
 * @author croakzh
 */
@Data
public class CpuInfo {

    /**
     * Cpu总核数
     */
    private Integer totalCores;
    /**
     * Cpu总套接字量
     */
    private Integer totalSockets;
    /**
     * 每个套接字的核心线程数
     */
    private Integer coresPerSocket;

    private List<CpuDetailInfo> perCpus;

    /**
     * Cpu相关详情
     */
    @AllArgsConstructor
    @Data
    public static class CpuDetailInfo {
        /**
         * Cpu生产商
         */
        private String vendor;
        /**
         * Cpu类别
         */
        private String model;
        /**
         * Cpu主频
         */
        private Integer mhz;
        /**
         * Cpu缓存数量
         */
        private Long cacheSize;
    }

}
