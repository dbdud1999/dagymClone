package com.project.dagymClone.Entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="ad")
@Data
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @ColumnDefault("0")
    int fileUid;
    @ColumnDefault("0")
    boolean isTop;

    Timestamp regDate;
    Timestamp updateDate;
}
