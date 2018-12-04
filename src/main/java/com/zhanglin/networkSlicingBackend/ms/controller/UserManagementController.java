package com.zhanglin.networkSlicingBackend.ms.controller;

import com.zhanglin.networkSlicingBackend.ms.entity.User;
import com.zhanglin.networkSlicingBackend.ms.exception.MyException;
import com.zhanglin.networkSlicingBackend.ms.model.MyResponse;
import com.zhanglin.networkSlicingBackend.ms.model.UserLoginRequest;
import com.zhanglin.networkSlicingBackend.ms.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@CrossOrigin
public class UserManagementController {


    @Autowired
    UserServiceImpl userService;
    /**
     * User login
     * @param userLoginRequest
     * @return
     * @throws MyException
     */
    @ApiOperation(value = "user login", notes = "")
    @ResponseBody
    @RequestMapping(value = "/user/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object userLogin(@RequestBody @Valid UserLoginRequest userLoginRequest) throws MyException {
//        return MyResponse.ok(userService.login(userLoginRequest));
        return userService.login(userLoginRequest);
    }

    /**
     *
     * @param userEmail
     * @return
     * @throws MyException
     */
    @ApiOperation(value = "user logout", notes = "user logout")
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/user/logout", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public MyResponse logout(@RequestParam @Valid String userEmail) throws MyException {

        return MyResponse.ok();
    }

    }
