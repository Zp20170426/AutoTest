package com.course.testng;

import org.testng.annotations.Test;


// 依赖测试，test2依赖test1的数据，只有在test1执行成功test2才会被执行
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1  run");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2  run");
    }
}
