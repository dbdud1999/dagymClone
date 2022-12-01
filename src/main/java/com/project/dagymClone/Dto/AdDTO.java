package com.project.dagymClone.Dto;

import com.project.dagymClone.Entity.Ad;
import com.project.dagymClone.Entity.FileGroup;
import lombok.Data;

import java.util.Date;

@Data
public class AdDTO {
    int uid;
    FileGroup img;
    int sequence;

    boolean onService;
    Date regDate;
    Date updateDate;

    public AdDTO(Ad ad) {
        this.uid = ad.getUid();
        this.img = ad.getImg();
        this.sequence = ad.getSequence();

        this.onService = ad.isOnService();
        this.regDate = ad.getRegDate();
        this.updateDate = ad.getUpdateDate();
    }
}
