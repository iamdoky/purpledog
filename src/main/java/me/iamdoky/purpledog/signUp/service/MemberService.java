package me.iamdoky.purpledog.signUp.service;

import lombok.RequiredArgsConstructor;
import me.iamdoky.purpledog.signUp.model.Member;
import me.iamdoky.purpledog.signUp.model.request.MemberRequest;
import me.iamdoky.purpledog.signUp.repository.MemberRepository;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> memberList() {
        return memberRepository.findAll();
    }

    public Member memberView( String memberId ) {
        Optional<Member> member = memberRepository.findByMemberId( memberId );
        if ( member.isPresent() ) {
            return member.get();
        }
        throw new EntityNotFoundException("Cant find any book under given memberID");
    }

    public Member memberCreate( MemberRequest request ) {
        Member member = new Member();
        member.setMemberId(request.getMemberId());
        member.setPassword(request.getPassword());
        return memberRepository.save( member );
    }

    public Member memberUpdate ( String memberId, MemberRequest request ) {
        Optional<Member> optionalMember = memberRepository.findByMemberId( memberId );
        if ( !optionalMember.isPresent() ) {
            throw new EntityNotFoundException("Member not present in the database");
        }

        Member member = optionalMember.get();
        member.setMemberId(request.getMemberId());
        member.setPassword(request.getPassword());

        return memberRepository.save(member);
    }

    public void memberDelete( String id ) {
        memberRepository.deleteByMemberId( id );
    }



}
