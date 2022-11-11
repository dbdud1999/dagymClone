package com.project.dagymClone.Repository;

import com.project.dagymClone.Dto.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GymRepository extends JpaRepository<Gym, Integer> {
    public List<Gym> findAll();
    public Gym findByUid(int uid);
}
