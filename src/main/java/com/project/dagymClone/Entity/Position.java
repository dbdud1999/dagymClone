package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @NotNull
    @ColumnDefault("''")
    String position;  // 1: 대표, 2: 직원, 3: 트레이너, 4: 아르바이트
    @NotNull
    @ColumnDefault("0")
    int sequence;

    @NotNull
    @ColumnDefault("0")
    boolean onService;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    Date regDate;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    Date updateDate;
}
