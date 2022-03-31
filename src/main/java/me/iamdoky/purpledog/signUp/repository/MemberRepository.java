package me.iamdoky.purpledog.signUp.repository;

import me.iamdoky.purpledog.signUp.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByMemberId( String memberId );
    Optional<Member> deleteByMemberId( String memberId);

}
