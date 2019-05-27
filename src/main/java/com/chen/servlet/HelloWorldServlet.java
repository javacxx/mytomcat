package com.chen.servlet;

import com.chen.net.MyRequest;
import com.chen.net.MyResponse;

import java.io.IOException;

/**
 * @author CXX
 * @date 2019/5/14 19:24
 */
public class HelloWorldServlet extends MyServlet {
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) throws IOException {
        myResponse.write("GET  hello world");
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) throws IOException {
        myResponse.write("POST  hello world");
    }
}
