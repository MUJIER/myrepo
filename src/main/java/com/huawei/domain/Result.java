package com.huawei.domain;


import com.huawei.constant.HttpStatus;
import com.huawei.utils.StringUtils;

import java.util.HashMap;

public class Result<T> extends HashMap<String,Object> {
    /** 状态码
     * 1 成功，0 失败
     * */
    public static final String CODE_TAG = "code";

    /** 返回内容 */
    public static final String MSG_TAG = "msg";

    /** 数据对象 */
    public static final String DATA_TAG = "data";

    public static final String FINISH_FLAG = "finishFlag";

    public Result(){

    }

    public Result(int code, String msg){
        super.put("code",CODE_TAG);
        super.put("msg",MSG_TAG);
    }

    public Result(int code, String msg, Object data)
    {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        if (StringUtils.isNotNull(data))
        {
            super.put(DATA_TAG, data);
        }
    }

    public static Result success(){
        return Result.success("操作成功");
    }

    private static Result success(String msg) {

        return Result.success(msg,null);
    }

    private static Result success(String msg, Object data) {
        return new Result(HttpStatus.SUCCESS, msg, data);
    }

    public static Result success(Object data)
    {
        return Result.success("操作成功", data);
    }
}
