package com.sffj2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sffj2.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
