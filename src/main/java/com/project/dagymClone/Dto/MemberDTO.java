package com.project.dagymClone.Dto;

import com.project.dagymClone.Entity.FileGroup;
import com.project.dagymClone.Entity.Member;
import lombok.Data;

import java.util.Date;

@Data
public class MemberDTO {
    int uid;
    String accountId;
    String password;

    String name;
    String nickname;
    String phoneNum;
    FileGroup profileImg;

    Date regDate;
    Date updateDate;

    public MemberDTO(Member member) {
        this.uid = member.getUid();
        this.accountId = member.getAccountId();
        this.password = member.getPassword();

        this.name = member.getName();
        this.nickname = member.getNickname();
        this.phoneNum = member.getPhoneNum();
        this.profileImg = member.getProfileImg();

        this.regDate = member.getRegDate();
        this.updateDate = member.getUpdateDate();
    }
}
