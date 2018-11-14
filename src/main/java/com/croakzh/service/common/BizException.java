package com.croakzh.service.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 自定义异常
 *
 * @author croakzh
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private Integer errorCode = 0;
    private String description = "";

}
