package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass2 {

    public void stu1(){
        System.out.println("GroupOnClass2222中的stu11111运行了");
    }

    public void stu2(){
        System.out.println("GroupOnClass2222中的stu22222运行了");
    }
}
