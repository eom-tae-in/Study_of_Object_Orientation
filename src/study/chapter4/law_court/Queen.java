package src.study.chapter4.law_court;

class Queen implements Judge, Witness {

    private static final Judge judgeInstance = new Queen();
    private static final Witness witnessInstance = new Queen();

    private Queen() {
    }

    static Judge getJudgeInstance() {
        return judgeInstance;
    }

    static Witness getWitnessInstance() {
        return witnessInstance;
    }

    @Override
    public void start() {
        System.out.println("재판을 시작하겠습니다. (판사: queen)");
    }

    @Override
    public Witness callWitness(Rabbit rabbit) {
        return rabbit.getWitness();
    }

    @Override
    public void doTestify(Witness witness) {
        witness.testify();
    }

    @Override
    public Judge changeJudge(Judge judge) {
        return judge;
    }

    @Override
    public Witness enterCourt() {
        return Members.QUEEN.getWitness();
    }

    @Override
    public void testify() {
        System.out.println("증인으로 출석하게 된 여왕입니다. 모든 질문에 성실히 답변하겠습니다.");
    }
}
