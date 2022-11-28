package com.project.dagymClone.Repository;

import com.project.dagymClone.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    public Member findByAccountId(String accountId);
}
