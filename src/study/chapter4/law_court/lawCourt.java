package src.study.chapter4.law_court;

class lawCourt {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        output.printAskJudge();
        Judge judge = input.judge();
        output.printAskRabbit();
        Manager manager = input.rabbit();
        manager.setWitnesses();
        while (manager.witnessNumber() > 0) {
            Witness witness = judge.callWitness(manager);
            witness.testify();
        }
    }
}
