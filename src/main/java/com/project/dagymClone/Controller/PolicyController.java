package com.project.dagymClone.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("policy")
public class PolicyController {
    @GetMapping("service")
    public String service(){
        return "policy/service";
    }
}
