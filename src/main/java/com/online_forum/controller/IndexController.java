package com.online_forum.controller;

import com.online_forum.common.R;
import com.online_forum.entity.Book;
import com.online_forum.service.BookService;
import com.online_forum.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private IndexService indexService;

    /**
     * 加载
     * @return
     */
    @GetMapping
    public R loadIndex(){

        Map<String, Object>randomMoviesAndBooks = indexService.getRandomMoviesAndBooks();

        return new R(1,"load index success",randomMoviesAndBooks,null);
    }
}
