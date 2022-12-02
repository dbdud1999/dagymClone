package com.project.dagymClone.Repository;

import com.project.dagymClone.Entity.FileUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileUnitRepository extends JpaRepository<FileUnit, Integer> {
}
