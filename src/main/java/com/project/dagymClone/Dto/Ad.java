package com.project.dagymClone.Dto;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="ad")
@Data
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    int fileUid;
    boolean isTop;

    Timestamp regDate;
    Timestamp updateDate;
}
