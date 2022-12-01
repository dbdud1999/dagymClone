package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="ad")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @OneToOne
    FileGroup img;
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
