package com.project.dagymClone.Repository;

import com.project.dagymClone.Entity.ManagerPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerPositionRepository extends JpaRepository<ManagerPosition, Integer> {
    public ManagerPosition findByUid(int uid);
}
