package com.croakzh;

import com.croakzh.entity.CpuInfo;

import java.util.ArrayList;

/**
 * @author croakzh
 */
public class Main {

    public static void main(String[] args) {
        CpuInfo cpuInfo = new CpuInfo();
        cpuInfo.setPerCpus(new ArrayList<CpuInfo.CpuDetailInfo>() {
            {
                add(new CpuInfo.CpuDetailInfo("", "", 1, 1L));
                add(new CpuInfo.CpuDetailInfo("", "", 2, 1L));
                add(new CpuInfo.CpuDetailInfo("", "", 3, 1L));
                add(new CpuInfo.CpuDetailInfo("", "", 4, 1L));
            }
        });
        System.out.println(cpuInfo.toString());
    }

}
