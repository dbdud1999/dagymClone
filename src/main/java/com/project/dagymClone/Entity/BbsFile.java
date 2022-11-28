package com.project.dagymClone.Entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Table(name="bbs_file")
@Entity
public class BbsFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    String fileUrl;

    Timestamp regDate;
}
