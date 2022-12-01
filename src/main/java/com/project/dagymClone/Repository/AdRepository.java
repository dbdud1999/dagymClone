package com.project.dagymClone.Repository;

import com.project.dagymClone.Entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRepository extends JpaRepository<Ad, Integer> {
    // 광고 두개 자르기
    public List<Ad> findTop2ByOnServiceOrderBySequenceAsc(boolean onService);
}
