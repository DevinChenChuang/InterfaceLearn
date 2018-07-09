package com.course.cases;

import com.course.config.TestConfig;
import com.course.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddUserCase {

    @Test(dependsOnGroups = "loginTrue",description = "add user")
    public void addUser() throws IOException{
        SqlSession session = DatabaseUtil.getSqlSession();
        AddUserCase addUserCase = session.selectOne("addUserCase","1");
        System.out.println(addUserCase.toString());
        System.out.println(TestConfig.addUserUrl);
    }
}
