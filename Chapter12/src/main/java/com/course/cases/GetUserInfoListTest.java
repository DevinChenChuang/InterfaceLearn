package com.course.cases;

import com.course.config.TestConfig;
import com.course.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetUserInfoListCase {

    @Test(dependsOnGroups = "loginTrue",description = "get sex man user")
    public void getUerListInfo() throws IOException{
        SqlSession session = DatabaseUtil.getSqlSession();
        GetUserInfoListCase getUserInfoListCase = session.selectOne("getUserListCase",1);
        System.out.println(getUserInfoListCase.toString());
        System.out.println(TestConfig.getUserListUrl);
    }
}
