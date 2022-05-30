package hello.core.scan;

import hello.core.AutoAppConfig;
import hello.core.member.MemberService;
import hello.core.order.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoAppConfigTest {

    @Test
    void basicScan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        System.out.println(ac.getBean(OrderServiceImpl.class).getDiscountPolicy()); // @Primary, @Qualifier 우선순위에 따라 주입된 클래스 확인
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
