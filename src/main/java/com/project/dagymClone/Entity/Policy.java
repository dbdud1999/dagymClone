package com.project.dagymClone.Entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="policy")
@Data
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    String type;  // "service" : 약관, "privacy" : 개인정보 처리방침, "lbs" : 위치정보 이용 약관
    String contents;

    Timestamp regDate;
    Timestamp updateDate;
}
