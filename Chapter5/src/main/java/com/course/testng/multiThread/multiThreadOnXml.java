package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class multiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
