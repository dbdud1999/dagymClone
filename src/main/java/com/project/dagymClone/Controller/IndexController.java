package com.project.dagymClone.Controller;

import com.project.dagymClone.Service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping("/")
    public String index(Model model){
        // 배너
        model.addAttribute("banner", indexService.getBanner());

        // 광고
        HashMap<String, String> adMap = indexService.getAd();
        for(String adLocation : adMap.keySet()){
            model.addAttribute(adLocation, adMap.get(adLocation));
        }

        // 소개
        model.addAttribute("exhibition1", indexService.getExhibition(true));
        model.addAttribute("exhibition2", indexService.getExhibition(false));

        return "index";
    }
}
