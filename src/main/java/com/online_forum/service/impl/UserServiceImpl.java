package com.online_forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.online_forum.entity.User;
import com.online_forum.mapper.UserMapper;
import com.online_forum.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
