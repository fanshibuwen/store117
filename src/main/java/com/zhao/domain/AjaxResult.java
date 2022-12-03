package com.zhao.domain;

import com.zhao.constant.HttpStatus;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/**
 * @Author zhaoL
 * @Time 2022/11/26 8:49
 */
public class AjaxResult extends HashMap<String,Object> implements Serializable {

    private static final String CODE_TAG =  "code";
    private static final String MSG_TAG = "mas";
    private static final String DATA_TAG =  "data";

    public AjaxResult() {
    }

    /**
     * 创建一个新的 AjaxResult对象
     * @param code
     * @param msg
     * @param data
     */
    public AjaxResult(Integer code, String msg, Object data) {
        super.put(CODE_TAG,code);
        super.put(MSG_TAG,msg);
        if (Objects.nonNull(data)) {
            super.put(DATA_TAG,data);
        }
    }

    /**
     * 返回成功消息
     *
     * 可以看到，其实这三个 success 方法都是调用的同一个 success
     * @return 成功消息
     */
    public static AjaxResult success(){
        return AjaxResult.success("操作成功");
    }

    /**
     * 返回成功方法
     * @param msg 返回内容
     * @return 成功消息
     */
    public static AjaxResult success(String msg) {
        return AjaxResult.success(msg,null);
    }

    /**
     * 返回成功方法
     * @param data 数据对象
     * @return 成功消息
     */
    public static AjaxResult success(Object data) {
        return AjaxResult.success("操作成功",data);
    }

    /**
     * 返回成功方法
     * @param msg 返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static AjaxResult success(String msg, Object data) {
        return new AjaxResult(HttpStatus.SUCCESS,msg,data);
    }

    /**
     * 返回失败方法
     * @return 失败消息
     */
    public static AjaxResult error() {
        return AjaxResult.error("操作失败");
    }

    /**
     * 返回失败方法
     * @param msg 返回内容
     * @return 失败消息
     */
    public static AjaxResult error(String msg) {
        return AjaxResult.error(msg,null);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg 返回内容
     * @return 警告消息
     */
    public static AjaxResult error(int code, String msg)
    {
        return new AjaxResult(code, msg, null);
    }

    /**
     * 返回失败方法
     * @param msg 返回消息
     * @param data 数据对象
     * @return 失败消息
     */
    public static AjaxResult error(String msg, Object data) {
        return new AjaxResult(HttpStatus.ERROR,msg,data);
    }

}
