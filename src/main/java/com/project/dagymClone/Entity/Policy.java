package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="policy")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @NotNull
    @ColumnDefault("'service'")
    String type;  // "service" : 약관, "privacy" : 개인정보 처리방침, "lbs" : 위치정보 이용 약관
    @NotNull
    @ColumnDefault("''")
    String contents;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    Date regDate;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    Date updateDate;
}
