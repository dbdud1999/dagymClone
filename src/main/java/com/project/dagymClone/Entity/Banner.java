package com.project.dagymClone.Entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Table(name="banner")
@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @ColumnDefault("0")
    int fileUid;
    int sort;   // 정렬 순서

    Timestamp regDate;
    Timestamp updateDate;
}
