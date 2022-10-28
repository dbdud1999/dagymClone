package com.project.dagymClone.Repository;

import com.project.dagymClone.Dto.BbsFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BbsFileRepository extends JpaRepository<BbsFile, Integer> {
    public BbsFile findByUid(int uid);
}
