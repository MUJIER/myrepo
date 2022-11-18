package com.huawei.myTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.huawei.domain.Result;
import com.huawei.vo.StudentVO;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

import static com.huawei.domain.Result.DATA_TAG;

public class Test005 {
    public static void main(String[] args) {
        String[] str = {"aaa", "bbb"};
        String[] str1 = new String[]{"test","my"};
        String s = Arrays.toString(str1);
//        System.out.println(s);
        String resultStr = StringUtils.join(str1, ",");
//        System.out.println(resultStr);


        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        String result = StringUtils.join(list, ",");
//        System.out.println(result);

        Map<String,String> map = new HashMap<>();
        map.put("id","001");
        map.put("name","jack");
        map.put("age","12");
//        System.out.println(map);
        List<Map> maps = new ArrayList<>();
        maps.add(map);
//        System.out.println(maps);

        Map<String,List<StudentVO>> map1 = new HashMap<>();
        List<StudentVO> stu1 = new ArrayList<>();
        stu1.add(new StudentVO("001","jack",12));
        List<StudentVO> stu2 = new ArrayList<>();
        stu2.add(new StudentVO("002","tom",13));
        map1.put("1",stu1);
        map1.put("2",stu2);
        Result success = Result.success(map1);
//        System.out.println(success);

        String s1 = JSON.toJSONString(success);
//        System.out.println(s1);
        LinkedHashMap<String,String> dataMap = null;
        Object data = success.get("data");
//        dataMap = (LinkedHashMap<String, String>) data;
//        System.out.println(dataMap);
//        System.out.println(s1);
//        System.out.println(s1);
//        Object data = Result.success(map1).get("data");
//        Object o = JSON.parseObject(String.valueOf(data)).get("1");
//        System.out.println(o);
//        System.out.println(map1);

        List<Map> list1 = new ArrayList<>();
        Object o1 = JSON.parseObject(s1).get(DATA_TAG);
        Map mm = (Map)o1;
        for (Object key : mm.keySet()) {
            Object one = JSON.parseObject(String.valueOf(o1)).get(key);
            JSONArray jsonArray = null;
            jsonArray = (JSONArray) one;
            for (int i = 0; i < jsonArray.size(); i++) {
                Map<String, Object> hashMap = new HashMap<>();
                hashMap.put("taskName",key);
                hashMap.put("age",jsonArray.getJSONObject(i).getString("age"));
                hashMap.put("name",jsonArray.getJSONObject(i).getString("name"));
//            System.out.println(jsonArray.getJSONObject(i).getString("age"));
//            System.out.println(hashMap);
                list1.add(hashMap);
//            System.out.println(list1);
                Result success1 = Result.success(list1);
            }
        }
        Result success2 = Result.success(list1);
        String s12 = JSON.toJSONString(success2);
        System.out.println(s12);
//        System.out.println(o1);

        Object one = JSON.parseObject(String.valueOf(o1)).get("1");
//        System.out.println(one);

        JSONArray jsonArray = null;
        jsonArray = (JSONArray) one;//获取数组
        for (int i = 0; i < jsonArray.size(); i++) {
            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("age",jsonArray.getJSONObject(i).getString("age"));
            hashMap.put("name",jsonArray.getJSONObject(i).getString("name"));
//            System.out.println(jsonArray.getJSONObject(i).getString("age"));
//            System.out.println(hashMap);
            list1.add(hashMap);
//            System.out.println(list1);
            Result success1 = Result.success(list1);
//            System.out.println(success1);
        }
//        System.out.println(jsonArray.getJSONObject(0).get("name"));


        Map<String,String> map2 = (Map<String, String>) success.get("data");
        for (String s2 : map2.keySet()) {
            Object s3 = map2.get(s2);


        }
//        System.out.println(map2);
    }
}
