package src.study.chapter4.law_court;

import src.study.chapter4.law_court.exception.NotFoundJudgeException;
import src.study.chapter4.law_court.exception.NotFoundRabbitException;
import java.util.Scanner;

class Input {

    Scanner sc = new Scanner(System.in);

    Judge judge() {
        try {
            String member = sc.next();
            return Members.checkJudgeMember(member);
        } catch (NotFoundJudgeException e) {
            return judge();
        }
    }

    Manager rabbit() {
        try {
            String member = sc.next();
            return Members.checkRabbitMember(member);
        } catch (NotFoundRabbitException e) {
            return rabbit();
        }
    }
}
