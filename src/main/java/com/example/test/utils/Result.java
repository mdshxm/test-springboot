package com.example.test.utils;

import java.util.Map;
import lombok.Data;

@Data
public class Result {public static final int CODE_SUCCESS = 200;
    public static final int CODE_ERROR = 500;
    public static final String MSG_SUCESS = "操作成功";
    public static final String MSG_ERROR = "操作失败";


    private int code;

    private String msg;

    private Object data;

    public Result() {

    }

    public Result(int code) {
        this.code = code;
    }

    public Result(int code, String message) {
        this.code = code;
        this.msg = message;
    }

    public Result(int code, String message, Object data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    /**
     * 请求成功 默认code是200，msg是'请求成功'
     *
     * @return
     */
    public static Result success() {
        return new Result(CODE_SUCCESS, MSG_SUCESS);
    }

    /**
     * 请求成功
     *
     * @param code
     * @return
     */
    public static Result success(int code) {
        return new Result(code, MSG_SUCESS);
    }

    /**
     * 请求成功 返回 消息 默认code是CODE_SUCCESS
     *
     * @param message
     * @return
     */
    public static Result success(String message) {
        return new Result(CODE_SUCCESS, message);
    }

    /**
     * 返回数据
     *
     * @param data
     * @return
     */
    public static Result success(Object data) {
        return new Result(CODE_SUCCESS, MSG_SUCESS, data);
    }

    /**
     * 请求成功 返回 编码 信息
     *
     * @param code    编码
     * @param message 消息
     * @return
     */
    public static Result success(int code, String message) {
        return new Result(code, message);
    }

    /**
     * 请求成功 返回 信息 和 数据 默认code是200
     *
     * @param message 信息
     * @param data    数据
     * @return
     */
    public static Result success(String message, Object data) {
        return new Result(CODE_SUCCESS, message, data);
    }

    /**
     * 请求成功 返回 code ,信息 和 数据
     *
     * @param code
     * @param message
     * @param data
     * @return
     */
    public static Result success(int code, String message, Object data) {
        return new Result(code, message, data);
    }

    /**
     * 请求失败
     *
     * @return
     */
    public static Result error() {
        return new Result(CODE_ERROR, MSG_ERROR);
    }

    /**
     * 请求失败
     *
     * @param msg 消息
     * @return
     */
    public static Result error(String msg) {
        return new Result(CODE_ERROR, msg);
    }

    /**
     * 请求错误 返回编码和信息
     *
     * @param code
     * @param message
     * @return
     */
    public static Result error(int code, String message) {
        return new Result(code, message);
    }

    /**
     * 请求错误 返回编码和信息和数据
     *
     * @param code
     * @param message
     * @param data
     * @return
     */
    public static Result error(int code, String message, Object data) {
        return new Result(code, message, data);
    }
}
