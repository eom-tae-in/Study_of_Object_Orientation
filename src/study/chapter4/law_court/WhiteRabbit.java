package src.study.chapter4.law_court;

import src.study.chapter4.law_court.exception.NotFoundWitnessException;
import java.util.LinkedList;
import java.util.Queue;

class WhiteRabbit implements Rabbit {

    private static final Rabbit rabbitInstance = new WhiteRabbit();
    Queue<Witness> witnesses = new LinkedList<>();

    private WhiteRabbit() {
    }

    static Rabbit getRabbitInstance() {
        return rabbitInstance;
    }

    @Override
    public Witness getWitness() {
        checkWitness();
        Witness witness = witnesses.poll();
        return witness.enterCourt();
    }

    @Override
    public void setWitnesses() {
        witnesses.addAll(Members.getWitnesses());
    }

    @Override
    public int witnessNumber() {
        return witnesses.size();
    }

    void checkWitness() {
        if (witnesses.isEmpty()) {
            throw new NotFoundWitnessException();
        }
    }
}
