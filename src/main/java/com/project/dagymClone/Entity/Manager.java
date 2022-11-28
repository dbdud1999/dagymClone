package com.project.dagymClone.Entity;

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
    int position;
    String gymList;

    Timestamp regDate;
    Timestamp updateDate;
}
