package com.project.dagymClone.Service;

import com.project.dagymClone.Entity.Manager;
import com.project.dagymClone.Repository.ManagerPositionRepository;
import com.project.dagymClone.Repository.ManagerRepository;
import com.project.dagymClone.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    ManagerPositionRepository managerPositionRepository;

    public HashMap<String, Object> getManagerInfo(String accountId) {
        HashMap<String, Object> managerInfo = new HashMap<>();

        Manager manager = managerRepository.findByAccountId(accountId);
        managerInfo.put("managerName", memberRepository.findByAccountId(manager.getAccountId()).getName());

        String position = (manager.getPosition() > 0)? managerPositionRepository.findByUid(manager.getPosition()).getPosition():"";
        managerInfo.put("position", position);

        return managerInfo;
    }
}
