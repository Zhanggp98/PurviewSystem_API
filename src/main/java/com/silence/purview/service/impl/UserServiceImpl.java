package com.silence.purview.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.silence.purview.entity.User;
import com.silence.purview.mapper.UserMapper;
import com.silence.purview.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
