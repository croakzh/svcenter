package com.croakzh.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@code RSResult} 统一定义的返回
 *
 * @author croakzh
 */
@Data
@NoArgsConstructor
public class RSResult {

    /**
     * 返回码
     */
    private int result;

    /**
     * 总数
     */
    private int total;

    /**
     * 返回的文本信息
     */
    private String message;

    /**
     * 返回数据对象
     */
    private Object data;

    public RSResult(int result, String message) {
        super();
        this.result = result;
        this.message = message;
    }

    public void setResult(int errorCode, String message, String defaultMessage) {
        try {
            this.result = errorCode;
            this.message = "".equals(message) ? defaultMessage : message;
        } catch (Exception ex) {
            this.result = -1;
            this.message = "".equals(message) ? defaultMessage : message;
        }
    }

}
