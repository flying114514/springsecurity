package com.sangeng;

import com.sangeng.domain.User;
import com.sangeng.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMapper {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testUserMapper() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

    }
}
