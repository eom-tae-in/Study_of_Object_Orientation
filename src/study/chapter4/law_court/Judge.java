package src.study.chapter4.law_court;

interface Judge {

    Witness callWitness(Rabbit rabbit);
    void doTestify(Witness witness);
    Judge changeJudge(Judge judge);
}
