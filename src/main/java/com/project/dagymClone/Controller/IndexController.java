package com.project.dagymClone.Controller;

import com.project.dagymClone.Service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("banner", indexService.getBanner());

        return "index";
    }
}
