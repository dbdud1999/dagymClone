package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "comport")
public class Comport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @NotNull
    @ColumnDefault("''")
    String name;
    @OneToOne
    FileGroup img;


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
