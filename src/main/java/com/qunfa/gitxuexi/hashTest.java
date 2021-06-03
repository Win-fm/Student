package com.qunfa.gitxuexi;


import org.testng.annotations.Test;

/**
 * @Author Miracle yqf
 * @Date 2021/6/2 0002 9:35
 * @Version 2020
 */
public class hashTest {
    @Test
    public void test(){
        Student stu1 = new Student("tom",24);
        Student stu2 = new Student("tom",24);
        System.out.println("两位同学是同一个人吗？"+stu1.equals(stu2));
        System.out.println("stu1.hashCode()="+stu1.hashCode());
        System.out.println("stu2.hashCode()="+stu2.hashCode());
    }
}
