package src.study.chapter3.garden.trump_members;

import src.study.chapter3.garden.Trump;

public class Guest extends Trump {
    @Override
    public void introduction() {
        System.out.println("게스트는 정원에 놀러온 트럼프인간입니다.");
    }
}
