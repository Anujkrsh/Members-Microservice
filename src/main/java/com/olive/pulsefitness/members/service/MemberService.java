package com.olive.pulsefitness.members.service;

import com.olive.pulsefitness.members.Model.Member;
import com.olive.pulsefitness.members.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> getMemberById(Long memberId) {
        return memberRepository.findById(memberId);
    }

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public Member updateMember(Long memberId, Member updatedMember) {
        Optional<Member> existingMember = memberRepository.findById(memberId);
        if (existingMember.isPresent()) {
            Member member = existingMember.get();
            return memberRepository.save(member);
        }
        return null;
    }

    public void deleteMember(Long memberId) {
        memberRepository.deleteById(memberId);
    }
}
