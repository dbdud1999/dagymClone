package com.project.dagymClone.Repository;

import com.project.dagymClone.Entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {
    public Manager findByMember(String member);
}
