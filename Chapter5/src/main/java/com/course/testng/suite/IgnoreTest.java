package com.course.testng.suite;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1  执行了");
    }

    //忽略测试，给@Test注解添加 enabled=false
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2  执行了");
    }
}
