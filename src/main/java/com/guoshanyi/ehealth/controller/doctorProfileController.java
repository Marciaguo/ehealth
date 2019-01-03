package com.guoshanyi.ehealth.controller;

import com.guoshanyi.ehealth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class doctorProfileController {
    @Autowired
    private UserService userService;

    @RequestMapping("/doctorProfilePrepare")
    public String toPatientProfile(HttpServletRequest request, Model model){
        //LoginUser user = SessionUtil.getLoginUser();
        return "doctorProfile";
    }
}
