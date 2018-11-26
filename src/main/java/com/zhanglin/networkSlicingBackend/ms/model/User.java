package com.zhanglin.networkSlicingBackend.ms.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
public class User {

        private String email;
        private String password;
        private String studentId;

}
