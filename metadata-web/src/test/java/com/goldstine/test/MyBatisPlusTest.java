package com.goldstine.test;

import com.goldstine.mapper.UserMapper;
import com.goldstine.pojo.User;
import org.example.MyBatisPlusApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyBatisPlusApplication.class)
public class MyBatisPlusTest {
    @Resource
    private UserMapper userMapper;

    /**
     * NULL point Exception: https://huaweicloud.csdn.net/64eea300c70554103b8eae66.html
     */

    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
//        User user = userMapper.selectById(1);
//        System.out.println(user);
    }

}
