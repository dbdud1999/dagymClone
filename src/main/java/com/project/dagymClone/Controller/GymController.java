package com.project.dagymClone.Controller;

import com.project.dagymClone.Service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("gym")
public class GymController {

    @Autowired
    DetailService detailService;

    @GetMapping("gym-list")
    public String gymList() {
        return "gym/gym-list";
    }
    @GetMapping("detail")
    public String detail(Model model, @RequestParam("uid") int uid) {
        model.addAttribute("gymInfo", detailService.getGymInfo(uid));
        model.addAttribute("titleFile", detailService.getGymTitleFileUrl(uid));

        return "gym/detail";
    }
}
