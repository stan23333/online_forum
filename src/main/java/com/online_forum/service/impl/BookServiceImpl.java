package com.online_forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.online_forum.entity.Book;
import com.online_forum.mapper.BookMapper;
import com.online_forum.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
}
