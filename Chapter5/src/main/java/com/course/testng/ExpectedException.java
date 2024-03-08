package com.course.testng;

//期望异常，在期望结果为异常的时候使用
//当传入某些不合法的参数，程序抛出了异常
//也就是说我的预期结果就是这个异常

import org.testng.annotations.Test;

public class ExpectedException {

    // 这是一个错误的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
