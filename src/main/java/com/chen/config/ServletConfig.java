package com.chen.config;

import com.chen.mapping.ServletMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CXX
 * @date 2019/5/14 19:39
 */
public class ServletConfig {
    public static List<ServletMapping> servletMappingList = new ArrayList<>();

    static {
        servletMappingList.add(new ServletMapping("first","/first","mytomcat.FirstServlet"));
        servletMappingList.add(new ServletMapping("helloWorld","/helloWorld","mytomcat.HelloWorldServlet"));

    }
}
