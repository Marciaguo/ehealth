package com.zhanglin.networkSlicingBackend.ms.service;

import com.zhanglin.networkSlicingBackend.ms.entity.User;
import com.zhanglin.networkSlicingBackend.ms.exception.MyException;
import com.zhanglin.networkSlicingBackend.ms.model.UserLoginRequest;

public interface UserService {

    public User login(UserLoginRequest userLoginRequest) throws MyException;


}
