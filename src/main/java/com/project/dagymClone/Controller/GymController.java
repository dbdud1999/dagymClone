package com.project.dagymClone.Controller;

import com.project.dagymClone.Service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("gym")
public class GymController {

    @Autowired
    GymService gymService;

    @GetMapping("gym-list")
    public String gymList() {
        return "gym/gym-list";
    }

    @ResponseBody
    @PostMapping("gym-list-ajax")
    public HashMap<String, String> gymListAjax(@RequestParam("lat") String lat, @RequestParam("lon") String lon) {
        HashMap<String, String> location = new HashMap<>();
        location.put("address", gymService.currentLocationInfo(Double.parseDouble(lat), Double.parseDouble(lon)));
        return location;
    }

    @GetMapping("detail")
    public String detail(Model model, @RequestParam("uid") int uid) {
        model.addAttribute("gymInfo", gymService.getGymInfo(uid));
        model.addAttribute("titleFile", gymService.getGymTitleFileUrl(uid));

        return "gym/detail";
    }
}
