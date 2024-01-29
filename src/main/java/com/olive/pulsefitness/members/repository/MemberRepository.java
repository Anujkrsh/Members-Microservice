package com.olive.pulsefitness.members.repository;

import com.olive.pulsefitness.members.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
