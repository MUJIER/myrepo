package com.huawei.myTest;


import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Slf4j
public class Test007 {
    public static void main(String[] args) {
        String s = "{\"error\":0,\"status\":\"success\",\"results\":[{\"currentCity\":\"青岛\",\"index\":[{\"title\":\"穿衣\",\"zs\":\"较冷\",\"tipt\":\"穿衣指数\",\"des\":\"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。\"},{\"title\":\"紫外线强度\",\"zs\":\"最弱\",\"tipt\":\"紫外线强度指数\",\"des\":\"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。\"}],}]}";
//        System.out.println(s);
        JSONObject jsonObject = JSONObject.fromObject(s);

        Object error = jsonObject.get("error");
        System.out.println(error);
        int error1 = jsonObject.getInt("error");
        System.out.println(error1);

        String status = jsonObject.getString("status");
        System.out.println(status);

        JSONArray result = jsonObject.getJSONArray("results");
        System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            String currentCity = result.getJSONObject(i).getString("currentCity");
            System.out.println(currentCity);


            JSONArray index = result.getJSONObject(i).getJSONArray("index");
            System.out.println(index);

            for (int j = 0; j < index.size(); j++) {
                String title = index.getJSONObject(j).getString("title");
                System.out.println(title);
            }
        }
    }
}
