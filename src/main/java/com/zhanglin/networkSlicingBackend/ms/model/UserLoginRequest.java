package com.zhanglin.networkSlicingBackend.ms.model;

import lombok.Data;

@Data
public class UserLoginRequest {

        private String email;
        private String password;
        private String studentId;

}
