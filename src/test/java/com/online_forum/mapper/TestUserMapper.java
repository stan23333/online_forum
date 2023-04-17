package com.online_forum.mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUserMapper {

    @Autowired
    private UserMapper userMapper;
    @Test
    void testGetPage(){

        userMapper.selectById(1);
    }
}
