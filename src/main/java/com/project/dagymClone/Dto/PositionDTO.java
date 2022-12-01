package com.project.dagymClone.Dto;

import com.project.dagymClone.Entity.Position;
import lombok.Data;

import java.util.Date;

@Data
public class PositionDTO {
    int uid;
    String position;  // 1: 대표, 2: 직원, 3: 트레이너, 4: 아르바이트
    int sequence;

    boolean onService;
    Date regDate;
    Date updateDate;

    public PositionDTO(Position position) {
        this.uid = position.getUid();
        this.position = position.getPosition();
        this.sequence = position.getSequence();

        this.onService = position.isOnService();
        this.regDate = position.getRegDate();
        this.updateDate = position.getUpdateDate();
    }
}
