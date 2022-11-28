package com.project.dagymClone.Controller;

import com.project.dagymClone.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @GetMapping("/")
    public String gymInfo(Model model){
        /* 로그인 안 되어있을 경우 */

        /*** TO DO (in service directory) ***/

        /* 로그인 되어있을 경우 */
        model.addAttribute("managerInfo", managerService.getManagerInfo("dbdud1999"));

        return "manager/gym-info";
    }
    @GetMapping("dashboard")
    public String dashboard(){
        return "manager/dashboard";
    }
}
