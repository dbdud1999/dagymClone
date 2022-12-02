package com.project.dagymClone.Controller;

import com.project.dagymClone.Service.UserIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    UserIndexService userIndexService;

    @GetMapping("/")
    public String home(){
        return "redirect:user/";
    }

    @GetMapping("file-upload")
    public String fileUpload(){
        return "/user/temporarily-file-upload";
    }

    @PostMapping("file-upload-process")
    public String fileUploadProcess(@RequestParam("path") String pathUri, @RequestParam("file") MultipartFile file) {
        userIndexService.uploadFile(pathUri, file);

        return "redirect:file-upload";
    }
}
