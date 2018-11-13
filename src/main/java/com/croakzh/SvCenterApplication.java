package com.croakzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * SV Center 监控中心
 * 1. 服务器性能的监控
 * 2. 服务器上进程的监控
 * 3.
 *
 * @author croakzh
 */
@SpringBootApplication
public class SvCenterApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SvCenterApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SvCenterApplication.class, args);
    }
}
