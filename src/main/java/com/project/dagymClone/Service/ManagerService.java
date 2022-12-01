package com.project.dagymClone.Service;

import com.project.dagymClone.Dto.ManagerDTO;
import com.project.dagymClone.Repository.ManagerRepository;
import com.project.dagymClone.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public HashMap<String, Object> getManagerInfo(String accountId) {
        HashMap<String, Object> managerInfo = new HashMap<>();

        ManagerDTO manager = new ManagerDTO(managerRepository.findByMember(accountId));
        managerInfo.put("managerName", manager.getMember().getName());
        if(manager.getPosition() != null)
            managerInfo.put("position", manager.getPosition().getPosition());

        return managerInfo;
    }
}
