package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("this is server test case 1111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("this is server test case 2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("this is client test case 3333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("this is client test case 4444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端运行之前的方法！");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端运行之后的方法！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端运行之前的方法！");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端运行之后的方法！");
    }

}
