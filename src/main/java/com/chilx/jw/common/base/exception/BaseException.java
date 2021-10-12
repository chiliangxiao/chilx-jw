package com.chilx.jw.common.base.exception;

/**
 * 异常基类
 *
 * @author chilx
 * @date 2021/3/10
 **/
public class BaseException extends RuntimeException {

    public static final String DEFAULT_CODE = "500";

    /**
     * 错误码
     */
    private String code;

    public BaseException() {
    }

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
    }


    public BaseException(String message) {
        super(message);
        this.code = DEFAULT_CODE;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
