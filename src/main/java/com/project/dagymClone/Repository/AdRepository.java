package com.project.dagymClone.Repository;

import com.project.dagymClone.Entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRepository extends JpaRepository<Ad, Integer> {
    public Ad findByIsTop(boolean isTop);
}
