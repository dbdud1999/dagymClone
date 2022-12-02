package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="banner")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Banner {
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

    @Builder
    public Banner (int sequence, boolean onService, Date regDate, Date updateDate) {
        this.sequence = sequence;
        this.onService = onService;
        this.regDate = regDate;
        this.updateDate = updateDate;
    }
    @Builder
    public Banner (FileGroup img, int sequence, boolean onService, Date regDate, Date updateDate) {
        this.img = img;
        this.sequence = sequence;
        this.onService = onService;
        this.regDate = regDate;
        this.updateDate = updateDate;
    }
}
