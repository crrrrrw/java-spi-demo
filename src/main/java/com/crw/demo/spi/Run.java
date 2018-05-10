package com.crw.demo.spi;

import java.util.ServiceLoader;

/**
 * 测试SPI
 */
public class Run {

    public static void main(String[] args) {
        ServiceLoader<HelloWorld> loads = ServiceLoader.load(HelloWorld.class);
        for (HelloWorld load : loads) {
            load.sayHello();
        }
    }
}
