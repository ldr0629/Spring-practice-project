package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// spring data jpa가 JpaRepository를 사용하면 구현체를 자동으로 만들어주므로 빈이 자동 등록된다.
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

    // JPA select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
