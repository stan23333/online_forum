package com.online_forum.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.online_forum.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
