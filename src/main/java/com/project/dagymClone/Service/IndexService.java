package com.project.dagymClone.Service;

import com.project.dagymClone.Dto.Banner;
import com.project.dagymClone.Dto.BbsFile;
import com.project.dagymClone.Repository.BannerRepository;
import com.project.dagymClone.Repository.BbsFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndexService {

    @Autowired
    BannerRepository bannerRepository;
    @Autowired
    BbsFileRepository bbsFileRepository;

    public List<String> getBanner() {
        List<Banner> bannerFilesUid = bannerRepository.findAllByOrderBySortAsc();
        List<String> bannerFilesUrl = new ArrayList<>();
        for(Banner bannerFileUid : bannerFilesUid) {
            BbsFile bannerFile = bbsFileRepository.findByUid(bannerFileUid.getFileUid());
            bannerFilesUrl.add(bannerFile.getFileUrl());
        }

        return bannerFilesUrl;

    }
}
