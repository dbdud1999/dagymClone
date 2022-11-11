package com.project.dagymClone.Service;

import com.project.dagymClone.Dto.BbsFile;
import com.project.dagymClone.Dto.Gym;
import com.project.dagymClone.Repository.BbsFileRepository;
import com.project.dagymClone.Repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {

    @Autowired
    BbsFileRepository bbsFileRepository;
    @Autowired
    GymRepository gymRepository;

    public Gym getGymInfo(int uid){
        return gymRepository.findByUid(uid);
    }

    public String getGymTitleFileUrl(int uid) {
        Gym gym = gymRepository.findByUid(uid);
        BbsFile gymTitleFile = bbsFileRepository.findByUid(gym.getFileUid());

        return gymTitleFile.getFileUrl();
    }
}
