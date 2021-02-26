package com.example.mapper;

import com.example.modle.User;

import java.util.List;

/**
 * @Auther: GEEX1428
 * @Date: 2021/2/23 17:05
 * @Description:
 */
public interface UserMapper {


    List<User> selectByLoginName(User user);
}
