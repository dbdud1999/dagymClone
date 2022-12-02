package com.project.dagymClone.Entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "file_group")
@NoArgsConstructor
public class FileGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    @NotNull
    String path;
    @OneToMany
    List<FileUnit> files = new ArrayList<>();
}
