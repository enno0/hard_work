package com.hard_work.enno.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/M")
public class M_Controller {

    @GetMapping("/UserMain")
    public String getMethodName() {
        return "redirect:" + "/U/Users";
    }

    @GetMapping("/UserRoleMain")
    public String getMethodName2() {
        return "redirect:" + "/Role/Users";
    }
}