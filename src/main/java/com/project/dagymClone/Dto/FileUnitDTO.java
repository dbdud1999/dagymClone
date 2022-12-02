package com.project.dagymClone.Dto;

import com.project.dagymClone.Entity.FileUnit;
import lombok.Data;

import java.util.Date;

@Data
public class FileUnitDTO {
    int uid;
    int sequence;
    String originalName;  // 서버 저장명은 file_{uid}.확장자명
    String serverName;
    String extension;
    long fileSize;

    boolean deleted;
    Date regDate;
    Date deleteDate;

    public FileUnitDTO(FileUnit file) {
        this.uid = file.getUid();

        this.sequence = file.getSequence();
        this.originalName = file.getOriginalName();
        this.serverName = file.getServerName();
        this.extension = file.getExtension();
        this.fileSize = file.getFileSize();

        this.deleted = file.isDeleted();
        this.regDate = file.getRegDate();
        this.deleteDate = file.getDeleteDate();
    }
}
