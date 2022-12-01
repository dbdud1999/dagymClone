package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="manager")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @OneToOne
    @JoinColumn(name = "account_id")
    Member member;
    @ManyToOne
    Position position;
    @OneToMany
    List<Gym> gyms = new ArrayList<>();

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    Date regDate;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    Date updateDate;
}
