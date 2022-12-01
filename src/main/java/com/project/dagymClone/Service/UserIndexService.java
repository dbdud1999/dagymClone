package com.project.dagymClone.Service;

import com.project.dagymClone.Dto.BannerDTO;
import com.project.dagymClone.Entity.Ad;
import com.project.dagymClone.Entity.Banner;
import com.project.dagymClone.Entity.File;
import com.project.dagymClone.Entity.Gym;
import com.project.dagymClone.Repository.AdRepository;
import com.project.dagymClone.Repository.BannerRepository;
import com.project.dagymClone.Repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class UserIndexService {

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
}
