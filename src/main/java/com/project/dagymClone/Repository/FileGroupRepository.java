package com.project.dagymClone.Repository;

import com.project.dagymClone.Entity.FileGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileGroupRepository extends JpaRepository<FileGroup, Integer> {
    public FileGroup findByUid(int uid);
}
