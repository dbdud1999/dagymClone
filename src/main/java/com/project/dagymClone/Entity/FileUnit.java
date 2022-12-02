package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="file")
@NoArgsConstructor
public class FileUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @NotNull
    @ColumnDefault("0")
    int sequence;
    @NotNull
    String originalName;  // 서버 저장명은 file_{uid}.확장자명
    @NotNull
    String serverName;
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

    @Builder
    public FileUnit(int sequence, String originalName, String extension, long fileSize, Date regDate) {
        this.sequence = sequence;
        this.originalName  = originalName;
        this.extension = extension;
        this.fileSize = fileSize;
    }

    @Builder
    public FileUnit(String serverName) {
        this.serverName = serverName;
    }
}
