package com.project.dagymClone.Repository;

import com.project.dagymClone.Dto.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerRepository extends JpaRepository<Banner, Integer> {
    //public List<Integer> getFileUidOrderBySortAsc();
    public List<Banner> findAllByOrderBySortAsc();
}