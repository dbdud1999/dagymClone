package com.project.dagymClone.Controller;

import com.project.dagymClone.Entity.Ad;
import com.project.dagymClone.Service.UserIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserIndexController {

    @Autowired
    UserIndexService userIndexService;

    @GetMapping("/")
    public String index(Model model){
        // 배너
        model.addAttribute("bannerList", userIndexService.getBanner());
        //광고
        model.addAttribute("adList",  userIndexService.getAd());
        // 소개
        model.addAttribute("exhibitionList", userIndexService.getExhibition());

        System.out.println(model);

        return "user/index";
    }
}
