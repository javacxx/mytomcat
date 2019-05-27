package com.chen.servlet;

import com.chen.net.MyRequest;
import com.chen.net.MyResponse;

import java.io.IOException;

/**
 * @author CXX
 * @date 2019/5/14 19:35
 */
public class FirstServlet extends MyServlet {
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) throws IOException {
        myResponse.write("GET  first servlet");
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) throws IOException {
        myResponse.write("POST  first servlet");
    }
}
