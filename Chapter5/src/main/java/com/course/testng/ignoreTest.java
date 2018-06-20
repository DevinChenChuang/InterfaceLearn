package com.course.testng;

import org.testng.annotations.Test;

public class ignoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore test 1111");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore test 2222");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore test 3333");
    }
}
