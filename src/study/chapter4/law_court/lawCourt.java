package src.study.chapter4.law_court;

class lawCourt {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        output.printAskJudge();
        Judge judge = input.judge();
        output.printAskRabbit();
        Rabbit rabbit = input.rabbit();
        rabbit.setWitnesses();
        while (rabbit.witnessNumber() > 0) {
            Witness witness = judge.callWitness(rabbit);
            witness.testify();
        }
    }
}
