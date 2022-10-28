package com.project.dagymClone.Dto;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Table(name="banner")
@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    int fileUid;
    int sort;   // 정렬 순서

    Timestamp regDate;
    Timestamp updateDate;
}
