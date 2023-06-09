package src.study.chapter4.law_court.witness;

import src.study.chapter4.law_court.Members;
import src.study.chapter4.law_court.Witness;

public class Chef implements Witness {

    private static final Witness witnessInstance = new Chef();

    private Chef() {
    }

    public static Witness getWitnessInstance() {
        return witnessInstance;
    }

    @Override
    public Witness enterCourt() {
        return Members.CHEF.getWitness();
    }

    @Override
    public void testify() {
        System.out.println("증인으로 출석하게 된 요리사입니다. 모든 질문에 성실히 답변하겠습니다.");
    }
}
