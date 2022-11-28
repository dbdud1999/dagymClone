package com.project.dagymClone.Controller;

import com.project.dagymClone.Service.UserGymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("user/gym")
public class UserGymController {

    @Autowired
    UserGymService userGymService;

    @GetMapping("gym-list")
    public String gymList() {
        return "user/gym/gym-list";
    }

    @ResponseBody
    @PostMapping("gym-list-ajax")
    public HashMap<String, String> gymListAjax(@RequestParam("lat") String lat, @RequestParam("lon") String lon) {
        HashMap<String, String> location = new HashMap<>();
        location.put("address", userGymService.currentLocationInfo(Double.parseDouble(lat), Double.parseDouble(lon)));
        return location;
    }

    @GetMapping("detail")
    public String detail(Model model, @RequestParam("uid") int uid) {
        model.addAttribute("gymInfo", userGymService.getGymInfo(uid));
        model.addAttribute("titleFile", userGymService.getGymTitleFileUrl(uid));

        return "user/gym/detail";
    }
}
