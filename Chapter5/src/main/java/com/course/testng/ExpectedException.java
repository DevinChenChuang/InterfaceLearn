package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /*
     * 异常测试
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("this is failed test !");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("this is successful test !");
        throw new RuntimeException();
    }
}
