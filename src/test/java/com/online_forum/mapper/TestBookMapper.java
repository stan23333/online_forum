package com.online_forum.mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestBookMapper {

    @Autowired
    private BookMapper bookMapper;
    @Test
    void testGetPage(){
        bookMapper.selectById(1);
    }
}
