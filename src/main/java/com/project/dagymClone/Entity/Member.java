package com.project.dagymClone.Entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="member")
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    String accountId;
    String password;

    // 마이페이지 정보
    String name;
    String nickname;
    String phoneNum;
    @ColumnDefault("0")
    int profileImg;

    Timestamp regDate;
    Timestamp updateDate;
}
