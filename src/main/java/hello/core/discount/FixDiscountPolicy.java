package hello.core.discount;

import hello.core.Grade;
import hello.core.annotation.MainDisCountPolicy;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
@MainDisCountPolicy
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }

}
