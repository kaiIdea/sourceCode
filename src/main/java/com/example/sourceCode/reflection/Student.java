package com.example.sourceCode.reflection;

/**
 * @Auther: GEEX1428
 * @Date: 2021/2/26 16:46
 * @Description:
 */
public class Student implements Pepole {
    @Override
    public String getName() {
        return "学生";
    }

    @Override
    public String getAddress() {
        return "学校";
    }
}
