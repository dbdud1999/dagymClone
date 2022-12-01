package com.project.dagymClone.Dto;

import com.project.dagymClone.Entity.Banner;
import com.project.dagymClone.Entity.FileGroup;
import lombok.Data;

import java.util.Date;

@Data
public class BannerDTO {
    int uid;
    FileGroup img;
    int sequence;

    boolean onService;
    Date regDate;
    Date updateDate;
    
    public BannerDTO(Banner banner) {
        this.uid = banner.getUid();
        this.img = banner.getImg();
        this.sequence = banner.getSequence();

        this.onService = banner.isOnService();
        this.regDate = banner.getRegDate();
        this.updateDate = banner.getUpdateDate();
    }
}
