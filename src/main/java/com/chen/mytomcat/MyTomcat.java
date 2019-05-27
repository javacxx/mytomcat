package com.chen.mytomcat;

import com.chen.net.MyRequest;
import com.chen.net.MyResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CXX
 * @date 2019/5/14 19:58
 */
public class MyTomcat {
    private int port = 8080;
    private Map<String, String> urlServletMap = new HashMap<>();

    public MyTomcat(int port) {
        this.port = port;
    }

    public void start() {
        initServletMapping();
    }

    private void initServletMapping() {

    }

    private void dispatch(MyRequest myRequest, MyResponse myResponse) {

    }

    public static void main(String[] args) {
        new MyTomcat(8080).start();
    }
}
