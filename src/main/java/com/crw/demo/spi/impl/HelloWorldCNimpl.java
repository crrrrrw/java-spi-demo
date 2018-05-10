package com.crw.demo.spi.impl;

import com.crw.demo.spi.HelloWorld;

/**
 * 中文版
 */
public class HelloWorldCNimpl implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("你好，世界！");
    }
}
