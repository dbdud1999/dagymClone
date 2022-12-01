package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="gym")
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @NotNull
    String name;

    @NotNull
    String postcode;
    @NotNull
    String streetAddress;
    @NotNull
    String lotAddress;
    @NotNull
    String detailAddress;
    @NotNull
    double lat;
    @NotNull
    double lon;

    @NotNull
    @ColumnDefault("''")
    String phoneNum;
    @NotNull
    @ColumnDefault("0")
    String telephone;
    @OneToOne

    FileGroup mainImg;
    @OneToOne

    FileGroup imgGroup;

    @NotNull
    @ColumnDefault("''")
    String title;
    @NotNull
    @ColumnDefault("''")
    String description;


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
