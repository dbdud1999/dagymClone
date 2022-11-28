package com.project.dagymClone.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("manager")
public class ManagerController {
    @GetMapping("dashboard")
    public String dashboard(){
        return "manager/dashboard";
    }
}
