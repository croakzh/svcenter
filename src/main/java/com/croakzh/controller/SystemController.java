package com.croakzh.controller;

import com.croakzh.controller.model.RSResult;
import com.croakzh.entity.vo.ServerVo;
import com.croakzh.service.common.BizException;
import com.croakzh.service.impl.SystemServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统信息
 *
 * @author croakzh
 */
@Controller
@RequestMapping("/server")
@Slf4j
public class SystemController {

    private final SystemServiceImpl systemService;

    @Autowired
    public SystemController(SystemServiceImpl systemService) {
        this.systemService = systemService;
    }

    @PostMapping("/info")
    public RSResult info(@RequestBody ServerVo cond) {
        log.info("Start get system information, params : ", cond);
        RSResult result = new RSResult();
        try {

            result.setResult(0);
        } catch (BizException ex) {

        }
        return result;
    }

    /**
     * 查看CPU详情
     *
     * @param cond 服务器信息
     * @return {@link RSResult} 服务器详情
     */
    @PostMapping("/cpu/info")
    public RSResult cpuInfo(@RequestBody ServerVo cond) {
        log.info("Start get cpu information, params : ", cond);
        RSResult result = new RSResult();
        if (StringUtils.isNotEmpty(cond.getIp())) {
            result.setResult(-1);
            result.setMessage("服务器IP不能为空！");
            return result;
        }
        if (StringUtils.isNotEmpty(cond.getUsername()) && StringUtils.isNotEmpty(cond.getPassword())) {
            result.setResult(-1);
            result.setMessage("登录用户名和密码不能为空！");
            return result;
        }
        try {
            result.setData(systemService.getCpuInfo(cond));
            result.setResult(0);
        } catch (BizException ex) {
            log.error("{} : {}", ex.getErrorCode(), ex.getDescription());
            result.setResult(ex.getErrorCode(), ex.getDescription(), "获取CPU详情失败");
        }
        log.info("Get cpu information success.");
        return result;
    }

}
