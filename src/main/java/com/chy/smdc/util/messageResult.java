package com.chy.smdc.util;

public class messageResult {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("请求成功");
        result.setData(object);
        return result;
    }

    public static  Result fail(Object object){
        Result result = new Result();
        result.setCode(400);
        result.setMsg("请求失败");
        result.setData(object);
        return result;
    }

    public static Result houtaisuccess(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("请求成功");
        result.setData(object);
        return result;
    }

}
