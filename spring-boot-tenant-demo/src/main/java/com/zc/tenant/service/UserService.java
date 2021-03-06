package com.zc.tenant.service;

import com.zc.tenant.entity.User;
import com.zc.tenant.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhao.cheng
 * @date 2020/9/27 15:34
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.selectList(null);
    }
}
