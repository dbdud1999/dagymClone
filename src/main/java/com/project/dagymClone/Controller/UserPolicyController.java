package com.project.dagymClone.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user/policy")
public class UserPolicyController {
    @GetMapping("service")
    public String service(){
        return "user/policy/service";
    }

    @GetMapping("privacy")
    public String privacy(){
        return "user/policy/privacy";
    }

    @GetMapping("location-based-service")
    public String locationBasedService(){
        return "user/policy/location-based-service";
    }
}
