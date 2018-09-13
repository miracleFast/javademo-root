package com.miracle.dubbo.demo.provider;

import com.miracle.dubbo.demo.api.DemoService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoServiceImple implements DemoService {

    public List<String> getPermissions(Long id) {

        List<String> resultList = new ArrayList<String>();
        resultList.add(String.format("Permission_%d", id - 1));
        resultList.add(String.format("Permission_%d",id));
        resultList.add(String.format("Permission_%d",id+1));
        return resultList;
    }

    @Override
    public List<String> getPermissions(String h,Integer a) {
        return null;
    }

    @Override
    public List<String> getPermissionAll(String h, Integer a) {
        return null;
    }

    public Map<String, String> getMap() {
        Map<String,String> mapResult = new HashMap<String, String>();
        mapResult.put("a","1");
        mapResult.put("b","2");
        mapResult.put("c","3");
        return null;
    }
}
