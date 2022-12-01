package com.project.dagymClone.Dto;

import com.project.dagymClone.Entity.Gym;
import com.project.dagymClone.Entity.Manager;
import com.project.dagymClone.Entity.Member;
import com.project.dagymClone.Entity.Position;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class ManagerDTO {
    int uid;
    Member member;
    Position position;
    List<Gym> gyms = new ArrayList<>();

    Date regDate;
    Date updateDate;

    public ManagerDTO(Manager manager) {
        this.uid = manager.getUid();
        this.member = manager.getMember();
        this.position = manager.getPosition();
        this.gyms = manager.getGyms();
        this.regDate = manager.getRegDate();
        this.updateDate = manager.getUpdateDate();
    }
}
