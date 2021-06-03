package com.yang.dao;

import com.yang.pojo.User;
import com.yang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author Miracle yqf
 * @Date 2021/6/2 0002 20:08
 * @Version 2020
 */
public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList){
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();
    }
}
