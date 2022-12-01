package com.project.dagymClone.Dto;

import com.project.dagymClone.Entity.FileGroup;
import com.project.dagymClone.Entity.Gym;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.Date;

@Data
public class GymDTO {
    int uid;
    String name;

    String postcode;
    String streetAddress;
    String lotAddress;
    String detailAddress;
    double lat;
    double lon;

    String phoneNum;
    String telephone;
    FileGroup mainImg;
    FileGroup imgGroup;

    String title;
    String description;

    boolean onService;
    Date regDate;
    Date updateDate;

    public GymDTO(Gym gym) {
        this.uid = gym.getUid();
        this.name = gym.getName();

        this.postcode = gym.getPostcode();
        this.streetAddress = gym.getStreetAddress();
        this.lotAddress = gym.getLotAddress();
        this.detailAddress = gym.getDetailAddress();
        this.lat = gym.getLat();
        this.lon = gym.getLon();

        this.phoneNum = gym.getPhoneNum();
        this.telephone = gym.getTelephone();
        this.mainImg = gym.getMainImg();
        this.imgGroup = gym.getImgGroup();

        this.title = gym.getTitle();
        this.description = gym.getDescription();

        this.onService = gym.isOnService();
        this.regDate = gym.getRegDate();
        this.updateDate = gym.getUpdateDate();
    }
}
