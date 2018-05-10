package com.crw.demo.spi.impl;

import com.crw.demo.spi.HelloWorld;

/**
 * 英文版
 */
public class HelloWorldENimpl implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("hello,world!");
    }
}
