package com.zyy.house.spider.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 公共结果类
 */
public class Result extends HashMap<String, Object>{
    private static final long serialVersionUID = 1L;

    public Result() {
        this.put("code", "0");
    }

    public Result(String code, String msg) {
        this.put("code", code);
        this.put("msg", msg);
    }

    public static Result error() {
        return new Result(Constant.RESULT.CODE_NO.getValue(), Constant.RESULT.MSG_NO.getValue());
    }

    public static Result error(String code, String msg) {
        Result r = new Result();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static Result ok() {
        return new Result(Constant.RESULT.CODE_YES.getValue(), Constant.RESULT.MSG_YES.getValue());
    }

    public static Result ok(String msg) {
        Result rst = new Result();
        rst.put("msg", msg);
        return rst;
    }

    public static Result ok(Map<String, Object> map) {
        Result r = new Result();
        r.putAll(map);
        return r;
    }

    @Override
    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
