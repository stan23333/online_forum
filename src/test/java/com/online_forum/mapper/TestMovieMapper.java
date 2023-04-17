package com.online_forum.mapper;
import com.online_forum.entity.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMovieMapper {

    @Autowired
    private MovieMapper movieMapper;
    @Test
    void testGetPage(){

        List<Movie> movieList = movieMapper.selectList(null);

    }
}
