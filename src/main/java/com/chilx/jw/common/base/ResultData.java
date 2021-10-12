package com.chilx.jw.common.base;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 通用返回类
 *
 * @author yangxi
 */
@Setter
@Getter
@ToString
public class ResultData implements Serializable {
    /**
     * 成功code
     */
    public static final String SUCCESS_CODE = "00000";
    /**
     * 失败code
     */
    public static final String FAIL_CODE = "AAAAA";

    /**
     * 成功
     */
    public static final String SUCCESS_MSG = "操作成功";
    /**
     * 失败
     */
    public static final String FAIL_MSG = "操作失败";

    /**
     * 错误码，默认情况下 0 为正常响应
     * -1 为错误响应
     */
    public String code;
    /**
     * 返回提示
     */
    public String message;
    /**
     * 返回数据
     */
    public Object data;


    private ResultData() {
    }

    private ResultData(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private ResultData(String code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }


    public static ResultData ok() {
        return ok(SUCCESS_MSG, null);
    }

    public static ResultData ok(Object data) {
        return ok(SUCCESS_MSG, data);
    }

    public static ResultData ok(String message, Object data) {
        return ok(SUCCESS_CODE, message, data);
    }

    public static ResultData ok(String code, String message, Object data) {
        return instance(code, message, data);
    }

    public static ResultData fail() {
        return fail(null);
    }

    public static ResultData fail(String message) {
        return fail(FAIL_CODE, message);
    }

    public static ResultData fail(String code, String message) {
        return fail(code, message, null);
    }

    public static ResultData fail(String code, String message, Object data) {
        return instance(code, message, data);
    }

    private static ResultData instance(String code, String message, Object data) {
        ResultData resultData = new ResultData();
        resultData.code = code;
        resultData.message = message;
        resultData.data = data;
        return resultData;
    }

}
