package com.online_forum.service.impl;

import com.online_forum.entity.Book;
import com.online_forum.entity.Movie;
import com.online_forum.mapper.BookMapper;
import com.online_forum.mapper.MovieMapper;
import com.online_forum.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.*;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private MovieMapper movieMapper;

    /**
     * 随机展示三个图书信息和三个电影信息
     *
     * @return
     */
    @Override
    public Map<String, Object> getRandomMoviesAndBooks() {

//        // 生成3个随机数
//        List<Integer> movieIds = new ArrayList<>();
//        List<Integer> bookIds = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            movieIds.add(new Random().nextInt(240) + 1);
//            bookIds.add(new Random().nextInt(200) + 1);
//        }


        List<Integer> movieIds = new ArrayList<>();
        List<Integer> bookIds = new ArrayList<>();
        SecureRandom random = new SecureRandom();
        Set<Integer> usedMovieIds = new HashSet<>();
        Set<Integer> usedBookIds = new HashSet<>();

        while (movieIds.size() < 3) {
            int id = random.nextInt(240) + 1;
            if (!usedMovieIds.contains(id)) {
                movieIds.add(id);
                usedMovieIds.add(id);
            }
        }

        while (bookIds.size() < 3) {
            int id = random.nextInt(200) + 1;
            if (!usedBookIds.contains(id)) {
                bookIds.add(id);
                usedBookIds.add(id);
            }
        }


        List<Book> bookList = bookMapper.selectBatchIds(bookIds);
        List<Movie> movieList = movieMapper.selectBatchIds(movieIds);
        // 封装结果
//        List< Object>> result = new ArrayList<>();
        Map<String, Object> result = new HashMap<>();

        List<Object> movies = new ArrayList<>();
        List<Object> books = new ArrayList<>();
        for (int i = 0; i < movieList.size(); i++) {
            movies.add(movieList.get(i));
            books.add(bookList.get(i));
        }
//        result.add(movies);
//        result.add(books)

        result.put("movies", movies);
        result.put("books", books);

        System.out.println();
        return result;
    }
}
