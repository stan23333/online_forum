package com.online_forum.service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestIndexService {

    @Autowired
    private IndexService indexService;
    @Test
    void testGetAll(){

        indexService.getRandomMoviesAndBooks();

    }
}
