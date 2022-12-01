package com.project.dagymClone.Service;

import com.project.dagymClone.Entity.File;
import com.project.dagymClone.Entity.Gym;
import com.project.dagymClone.Repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGymService {
    @Autowired
    GymRepository gymRepository;

    String REST_KEY = "bf3fe83aa47c252028b63e2f71319605";
    String kakaoMapUrl = "//dapi.kakao.com/v2/maps/sdk.js?appkey=" + REST_KEY + "&libraries=services";

    public String currentLocationInfo(double lat, double lon) {

        return "";
    }

    public Gym getGymInfo(int uid){
        return gymRepository.findByUid(uid);
    }
}
