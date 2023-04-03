package com.sffj2.dao;

import com.sffj2.entity.User;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Repository
@Mapper
public interface UserDAO {
    List<User> getAllUser();
}
