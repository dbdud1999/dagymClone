package com.project.dagymClone.Entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="gym")
@Data
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    String name;

    String address;
    String detailAddress;
    double lat;
    double lon;

    String phoneNum;
    String telephone;
    @ColumnDefault("0")
    int fileUid;
    String fileList;

    String title;
    String description;
    String comportList;

    Timestamp regDate;
    Timestamp updateDate;
}
