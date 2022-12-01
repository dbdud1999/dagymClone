package com.project.dagymClone.Dto;

import com.project.dagymClone.Entity.Policy;
import lombok.Data;

import java.util.Date;

@Data
public class PolicyDTO {
    int uid;
    String type;  // "service" : 약관, "privacy" : 개인정보 처리방침, "lbs" : 위치정보 이용 약관
    String contents;

    //boolean onService;
    Date regDate;
    Date updateDate;

    public PolicyDTO(Policy policy) {
        this.uid = policy.getUid();
        this.type = policy.getType();
        this.contents = policy.getContents();

        //this.onService = policy.isOnService();
        this.regDate = policy.getRegDate();
        this.updateDate = policy.getUpdateDate();
    }
}
