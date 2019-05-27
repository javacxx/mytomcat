package com.chen.net;

import lombok.Data;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author CXX
 * @date 2019/5/14 17:30
 */
@Data
public class MyRequest {
    private String method;
    private String url;

    public MyRequest(InputStream inputStream) throws IOException {
        String httpRequest = "";
        byte[] httpRequestBytes = new byte[1024];
        int length = 0;
        if ((length = inputStream.read(httpRequestBytes)) > 0) {
            httpRequest = new String(httpRequestBytes, 0, length);
        }

        String httpHead = httpRequest.split("\n")[0];
        method = httpHead.split("\\s")[0];
        url = httpRequest.split("\\s")[1];
        System.out.println(this);
    }
}
