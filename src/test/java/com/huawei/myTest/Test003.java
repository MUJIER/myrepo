package com.huawei.myTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import static com.huawei.domain.Result.DATA_TAG;
import static com.huawei.domain.Result.FINISH_FLAG;

public class Test003 {
    public static void main(String[] args) {

        String completeResult = "{\"msg\":\"操作成功\",\"code\":200,\"data\":{\"finishFlag\":true,\"backFlag\":false,\"varMap\":{}}}";
        System.out.println(completeResult);
//        System.out.println(JSON.parseObject(completeResult).get(DATA_TAG));
        Object o1 = JSON.parseObject(completeResult).get(DATA_TAG);
        Object finishFlag = JSON.parseObject(String.valueOf(o1)).get("finishFlag");
        boolean equals = "true".equals(String.valueOf(finishFlag));
//        System.out.println(equals);
//        System.out.println(JSON.parseObject(String.valueOf(o1)).get("finishFlag"));

        JSONObject jsonObject = JSON.parseObject(completeResult);
//        System.out.println(jsonObject);
//        System.out.println(jsonObject.get(FINISH_FLAG));
        JSONObject data = (JSONObject) JSON.parseObject(completeResult).get(DATA_TAG);
//        if ("true".equals(String.valueOf(JSON.parseObject(String.valueOf(JSON.parseObject(completeResult).get(DATA_TAG))).get(FINISH_FLAG)))){
//            System.out.println("22222");
//        }
//        boolean equals = "true".equals(String.valueOf(JSONObject.parseObject(String.valueOf(completeResult.get(Result.DATA_TAG))).get(FINISH_FLAG)));
        boolean equals1 = "true".equals(String.valueOf(JSON.parseObject(String.valueOf(JSON.parseObject(completeResult).get(DATA_TAG))).get(FINISH_FLAG)));
//        System.out.println(equals);
        boolean o = "true".equals(JSON.parseObject(String.valueOf(JSON.parseObject(completeResult).get(DATA_TAG))).get(FINISH_FLAG));
//        System.out.println(o);
//        System.out.println(JSON.parseObject(String.valueOf(JSON.parseObject(completeResult).get(DATA_TAG))).get(FINISH_FLAG));
//        System.out.println("11111");

        String s = "";

    }
}
