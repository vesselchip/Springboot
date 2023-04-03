package com.sffj2.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sffj2.entity.User;
import com.sffj2.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService{
}
