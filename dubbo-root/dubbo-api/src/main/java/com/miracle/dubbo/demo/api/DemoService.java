package com.miracle.dubbo.demo.api;

import java.util.List;
import java.util.Map;

public interface DemoService {
    List<String> getPermissions(Long id);
    List<String> getPermissions(String h,Integer a);
    List<String> getPermissionAll(String h,Integer a);
    Map<String,String> getMap();
}
