package com.huawei.myTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huawei.domain.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.MapUtils;

import java.util.Map;
import java.util.Objects;

@Slf4j
public class Test006 {
    public static void main(String[] args) {
        String completeResult = "{\"msg\":\"操作成功\",\"code\":200,\"data\":{\"finishFlag\":true,\"backFlag\":false,\"varMap\":{}}}";
//        System.out.println(completeResult);
        JSONObject jsonObject = JSON.parseObject(completeResult);
        String data = MapUtils.getString(jsonObject, Result.DATA_TAG, "");
//        System.out.println(data);
        Map<String, Object> map1 = JSON.parseObject(data);
//        System.out.println(map1);


        jsonToMap(completeResult);

        String s1 = "{\"msg\":\"操作成功\",\"code\":200}";
        Map<String, Object> s2 = jsonToMap(s1);
        System.out.println(s2);
        if(Objects.isNull(s2.get("code"))){
            System.out.println("====为空====");
        }
        Object code = s2.get("code");
        String code1 = MapUtils.getString(s2, "code");
        System.out.println(code1);
    }

    //json字符串转map集合
    private static Map<String, Object> jsonToMap(String s) {
        JSONObject jsonMap = null;
        try {
            jsonMap = JSON.parseObject(s);
        } catch (Exception e) {
            log.error("{}", e);
        }
        return jsonMap;
    }




}
