package com.project.dagymClone.Dto;

import com.project.dagymClone.Entity.File;
import com.project.dagymClone.Entity.FileGroup;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FileGroupDTO {
    int uid;
    String path;
    List<File> files = new ArrayList<>();

    public FileGroupDTO (FileGroup fileGroup) {
        this.uid = fileGroup.getUid();
        this.path = fileGroup.getPath();
        this.files = fileGroup.getFiles();
    }
}
