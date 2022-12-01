package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="file")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @NotNull
    @ColumnDefault("0")
    int sequence;
    @NotNull
    String originalName;  // 서버 저장명은 file_{uid}.확장자명
    @NotNull
    String extension;
    @NotNull
    long fileSize;

    @NotNull
    @ColumnDefault("0")
    boolean deleted;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    Date regDate;
    @Temporal(TemporalType.TIMESTAMP)
    Date deleteDate;
}
