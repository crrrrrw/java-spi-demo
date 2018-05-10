package com.crw.demo;

import com.crw.demo.spi.HelloWorld;
import org.junit.Test;

import java.util.ServiceLoader;

public class JavaSpiTest {

    @Test
    public void test() {
        ServiceLoader<HelloWorld> loads = ServiceLoader.load(HelloWorld.class);
        for (HelloWorld load : loads) {
            load.sayHello();
        }
    }
}
