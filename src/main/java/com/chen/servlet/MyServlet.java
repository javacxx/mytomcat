package com.chen.servlet;

import com.chen.net.MyRequest;
import com.chen.net.MyResponse;

import java.io.IOException;

/**
 * @author CXX
 * @date 2019/5/14 19:07
 */
public abstract class MyServlet {
    public abstract void doGet(MyRequest myRequest, MyResponse myResponse) throws IOException;

    public abstract void doPost(MyRequest myRequest, MyResponse myResponse) throws IOException;

    public void service(MyRequest myRequest, MyResponse myResponse) throws IOException {
        if (myRequest.getMethod().equalsIgnoreCase("GET")) {
            doGet(myRequest, myResponse);
        } else if (myRequest.getMethod().equalsIgnoreCase("POST")) {
            doPost(myRequest, myResponse);
        }
    }
}
