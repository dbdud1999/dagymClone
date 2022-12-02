package com.project.dagymClone.Service;

import com.project.dagymClone.Dto.FileUnitDTO;
import com.project.dagymClone.Entity.*;
import com.project.dagymClone.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserIndexService {
    @Autowired
    FileUnitRepository fileUnitRepository;
    @Autowired
    FileGroupRepository fileGroupRepository;
    @Autowired
    BannerRepository bannerRepository;
    @Autowired
    AdRepository adRepository;
    @Autowired
    GymRepository gymRepository;

    public List<Banner> getBanner() {
        return bannerRepository.findAllByOrderBySequenceAsc();
    }

    public List<Ad> getAd() {
        return adRepository.findTop2ByOnServiceOrderBySequenceAsc(true);
    }

    public HashMap<String, List<Gym>> getExhibition() {
        HashMap<String, List<Gym>> exhibitions = new HashMap<>();
        exhibitions.put("top", gymRepository.findAll());
        exhibitions.put("bottom", gymRepository.findAll());

        return exhibitions;
    }

    /*** 임시 파일 업로드 ***/
    public void uploadFile(String pathUri, MultipartFile originalFile) {
        List<FileUnit> files = new ArrayList<>();
        FileUnit fileUnit = new FileUnit();

        String fullFilename = originalFile.getOriginalFilename();
        String originalFilename = fullFilename.substring(0, fullFilename.lastIndexOf("."));
        String extension = fullFilename.substring(fullFilename.lastIndexOf(".") + 1);

        fileUnit.setSequence(0);
        fileUnit.setOriginalName(originalFilename);
        fileUnit.setExtension(extension);
        fileUnit.setFileSize(originalFile.getSize());
        fileUnit = fileUnitRepository.save(fileUnit);

        // 서버 네임 지정
        fileUnit.setServerName("file_" + fileUnit.getUid());
        fileUnit = fileUnitRepository.save(fileUnit);
        files.add(fileUnit);

        FileGroup fileGroup = new FileGroup();
        fileGroup.setPath(pathUri);
        fileGroup.setFiles(files);
        fileGroup = fileGroupRepository.save(fileGroup);

        String serverFilename = "C:/Users/dbdud/Pictures/" + fileGroup.getPath() + fileUnit.getServerName() + "." + fileUnit.getExtension();
        System.out.println(serverFilename.replace("/", "\\"));
        File uploadFile = new File(serverFilename.replace("/", "\\"));
        try {
            originalFile.transferTo(uploadFile);
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }

        return;
    }
}
