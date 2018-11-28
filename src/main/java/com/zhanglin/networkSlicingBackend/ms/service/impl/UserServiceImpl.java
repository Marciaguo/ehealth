package com.zhanglin.networkSlicingBackend.ms.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhanglin.networkSlicingBackend.ms.entity.Slice;
import com.zhanglin.networkSlicingBackend.ms.entity.User;
import com.zhanglin.networkSlicingBackend.ms.exception.MyException;
import com.zhanglin.networkSlicingBackend.ms.mapper.SliceMapper;
import com.zhanglin.networkSlicingBackend.ms.mapper.UserMapper;
import com.zhanglin.networkSlicingBackend.ms.model.UserLoginRequest;
import com.zhanglin.networkSlicingBackend.ms.service.SlicingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl {

    @Autowired
    private RyuRestService cviRestService;


    public User login(UserLoginRequest userLoginRequest) throws MyException {
        User user = null;
        try {
            //user = userMapper.queryUserByUserName(userLoginRequest.getUserName());
            log.info("查询数据库中");
            user = new User();
            user.setUserName("13121766988");
            user.setPassword("password");
            user.setUserLable("good");
        } catch (Exception e) {
            throw new MyException(MyException.FAIL,"用户"+ userLoginRequest.getUserName() + "查询出错");
        }

        // Email not exists
        if (user == null) {
            throw new MyException(MyException.FAIL,"用户"+ userLoginRequest.getUserName() + "不存在");
            // Email matches
        } else {
            // Check password
            if (user.getPassword().equals(userLoginRequest.getPassword())) {
                // Check role
                return user;
            } else {
                throw new MyException(MyException.FAIL,"用户名或密码错误");
            }
        }
    }

//    private void returnError(Exception e, Object params) throws MyException {
//        throw new MyException(MyException.FAIL, "DB: " + "#" + params.toString() + "#" + e.getMessage());
//    }

}
