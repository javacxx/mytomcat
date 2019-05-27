package com.chen.mapping;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author CXX
 * @date 2019/5/14 19:33
 */
@Data
@AllArgsConstructor
public class ServletMapping {
    private String servletName;
    private String url;
    private String clazz;
}
