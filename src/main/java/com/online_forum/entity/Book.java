package com.online_forum.entity;

import lombok.Data;
import java.util.Date;

/**
 * 图书实体类
 */

@Data
public class Book {
    private Integer id;
    private String title;
    private String author;
    private String publisher;
    private Date pubdate;
    private Float price;
    private String quote;
    private String pinyin;
}
