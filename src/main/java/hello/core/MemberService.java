package hello.core;

public interface MemberService {

    void join(Member member);

    Member findById(Long memberId);

}
