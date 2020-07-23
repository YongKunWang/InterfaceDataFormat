package com.home;

import com.home.response.ResponseWrapper;

public class Test {

    @org.junit.Test
    public void test1(){
        System.out.println("jjj");

        ResponseWrapper responseWrapper = ResponseWrapper.markCustom(true,"0000","查询成功","数据");
        System.out.println(responseWrapper);

    }
}
