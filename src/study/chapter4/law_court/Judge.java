package src.study.chapter4.law_court;

public interface Judge {

    void start();
    Witness callWitness(Manager manager);
    void doTestify(Witness witness);
    Judge changeJudge(Judge judge);
}
