package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @Column(unique = true)
    @NotNull
    String accountId;
    @NotNull
    String password;

    // 마이페이지 정보
    @NotNull
    String name;
    @NotNull
    @ColumnDefault("''")
    String nickname;
    @NotNull
    @ColumnDefault("''")
    String phoneNum;
    @OneToOne
    FileGroup profileImg;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    Date regDate;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    Date updateDate;
}
