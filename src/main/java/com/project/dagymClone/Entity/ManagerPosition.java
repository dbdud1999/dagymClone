package com.project.dagymClone.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="manager_position")
@Data
public class ManagerPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid;
    String position;  // 1: 대표, 2: 직원, 3: 트레이너, 4: 아르바이트
    int sort;
}
