package src.study.chapter3.garden;

import src.study.chapter3.garden.exception.NotFoundMemberException;
import java.util.Scanner;

class Input {

    Scanner sc = new Scanner(System.in);

    GardenMemberInfo member() {
        try {
            String member = sc.next();
            return GardenMemberInfo.checkMemberExist(member);
        } catch (NotFoundMemberException e) {
            return member();
        }
    }
}
