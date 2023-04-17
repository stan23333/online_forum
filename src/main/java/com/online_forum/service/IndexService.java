package com.online_forum.service;

import java.util.List;
import java.util.Map;

public interface IndexService {
    /**
     * 随机获取三个电影和图书的信息
     * @return
     */
    Map<String, Object> getRandomMoviesAndBooks();

}
