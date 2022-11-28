package com.project.dagymClone.Dto;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="manager")
@Data
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    String accountId;
    String password;

    // 마이페이지 정보
    String name;
    String phoneNum;
    int profile_img;

    String gymList;

    Timestamp regDate;
    Timestamp updateDate;
}
