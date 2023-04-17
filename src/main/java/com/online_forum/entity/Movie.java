package com.online_forum.entity;

import lombok.Data;

/**
 * 电影实体类
 */
@Data
public class Movie {

        private Integer id;
        private String title;
        private String pinyin;
        private double rating;
        private Integer ratingCount;
        private String director;
        private String actors;
        private Integer year;
        private String genre;
        private String quote;
}
