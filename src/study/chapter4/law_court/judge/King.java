package src.study.chapter4.law_court.judge;

import src.study.chapter4.law_court.Judge;
import src.study.chapter4.law_court.Manager;
import src.study.chapter4.law_court.Witness;

public class King implements Judge {

    private static final Judge judgeInstance = new King();

    private King() {
    }

    public static Judge getJudgeInstance() {
        return judgeInstance;
    }

    @Override
    public void start() {
        System.out.println("재판을 시작하겠습니다.(판사: king)");
    }

    @Override
    public Witness callWitness(Manager manager) {
        return manager.getWitness();
    }

    @Override
    public void doTestify(Witness witness) {
        witness.testify();
    }

    @Override
    public Judge changeJudge(Judge judge) {
        return judge;
    }
}
