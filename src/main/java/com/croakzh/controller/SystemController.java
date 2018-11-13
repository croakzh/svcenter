package com.croakzh.controller;

import com.croakzh.controller.model.RSResult;
import com.croakzh.entity.vo.ServerVo;
import com.croakzh.service.common.BizException;
import com.croakzh.service.impl.SystemServiceImpl;
import lombok.extern.slf4j.Slf4j;
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

}
