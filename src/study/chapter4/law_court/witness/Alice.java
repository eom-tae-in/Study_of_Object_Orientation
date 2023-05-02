package src.study.chapter4.law_court.witness;

import src.study.chapter4.law_court.Members;
import src.study.chapter4.law_court.Witness;

public class Alice implements Witness {

    private static final Witness witnessInstance = new Alice();

    private Alice() {
    }

    public static Witness getWitnessInstance() {
        return witnessInstance;
    }

    @Override
    public Witness enterCourt() {
        return Members.ALICE.getWitness();
    }

    @Override
    public void testify() {
        System.out.println("증인으로 출석하게 된 Alice입니다. 모든 질문에 성실히 답변하겠습니다.");
    }
}
