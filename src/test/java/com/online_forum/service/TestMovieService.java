package com.online_forum.service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMovieService {

    @Autowired
    private MovieService movieServicer;
    @Test
    void testGetAll(){

        movieServicer.list();

    }
}
