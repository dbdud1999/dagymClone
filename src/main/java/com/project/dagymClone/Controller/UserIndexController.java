package com.project.dagymClone.Controller;

import com.project.dagymClone.Service.UserIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("user")
public class UserIndexController {

    @Autowired
    UserIndexService userIndexService;

    @GetMapping("/")
    public String index(Model model){
        // 배너
        model.addAttribute("banner", userIndexService.getBanner());

        // 광고
        HashMap<String, String> adMap = userIndexService.getAd();
        for(String adLocation : adMap.keySet()){
            model.addAttribute(adLocation, adMap.get(adLocation));
        }

        // 소개
        model.addAttribute("exhibition1", userIndexService.getExhibition(true));
        model.addAttribute("exhibition2", userIndexService.getExhibition(false));

        return "user/index";
    }
}
