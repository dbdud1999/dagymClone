package com.project.dagymClone.Service;

import com.project.dagymClone.Dto.Ad;
import com.project.dagymClone.Dto.Banner;
import com.project.dagymClone.Dto.BbsFile;
import com.project.dagymClone.Dto.Gym;
import com.project.dagymClone.Repository.AdRepository;
import com.project.dagymClone.Repository.BannerRepository;
import com.project.dagymClone.Repository.BbsFileRepository;
import com.project.dagymClone.Repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class IndexService {

    @Autowired
    BannerRepository bannerRepository;
    @Autowired
    BbsFileRepository bbsFileRepository;
    @Autowired
    AdRepository adRepository;
    @Autowired
    GymRepository gymRepository;

    public List<String> getBanner() {
        List<Banner> bannerFilesUid = bannerRepository.findAllByOrderBySortAsc();
        List<String> bannerFilesUrl = new ArrayList<>();
        for(Banner bannerFileUid : bannerFilesUid) {
            BbsFile bannerFile = bbsFileRepository.findByUid(bannerFileUid.getFileUid());
            bannerFilesUrl.add(bannerFile.getFileUrl());
        }

        return bannerFilesUrl;

    }

    public HashMap<String, String> getAd() {
        // 위쪽 광고
        HashMap<String, String> adMap = new HashMap<>();
        Ad topAdFileUid = adRepository.findByIsTop(true);
        BbsFile topAdFile = bbsFileRepository.findByUid(topAdFileUid.getFileUid());
        adMap.put("adTop", topAdFile.getFileUrl());
        // 아래쪽 광고
        Ad bottomAdFileUid = adRepository.findByIsTop(false);
        BbsFile bottomAdFile = bbsFileRepository.findByUid(bottomAdFileUid.getFileUid());
        adMap.put("adBottom", bottomAdFile.getFileUrl());

        return adMap;
    }

    public List<List<String>> getExhibition(boolean isTop) {
        List<List<String>> exhibitions = new ArrayList<>();
        List<String> exhibitionUnit;  // gym 이름과 file url을 담을 변수
        List<Gym> gymList;
        BbsFile gymFile;

        if(isTop) gymList = gymRepository.findAll();
        else gymList = gymRepository.findAll();

        for(Gym gym : gymList) {
            exhibitionUnit = new ArrayList<>();
            exhibitionUnit.add(Integer.toString(gym.getUid()));
            exhibitionUnit.add(gym.getName());
            //File url 가져오기
            gymFile = bbsFileRepository.findByUid(gym.getFileUid());
            exhibitionUnit.add(gymFile.getFileUrl());

            exhibitions.add(exhibitionUnit);
        }

        return exhibitions;
    }
}
