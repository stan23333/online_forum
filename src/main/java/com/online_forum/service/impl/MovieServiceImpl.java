package com.online_forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.online_forum.entity.Movie;
import com.online_forum.mapper.MovieMapper;
import com.online_forum.service.MovieService;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl extends ServiceImpl<MovieMapper, Movie> implements MovieService {
}
