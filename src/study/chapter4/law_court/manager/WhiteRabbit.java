package src.study.chapter4.law_court.manager;

import src.study.chapter4.law_court.Members;
import src.study.chapter4.law_court.Manager;
import src.study.chapter4.law_court.Witness;
import src.study.chapter4.law_court.exception.NotFoundWitnessException;
import java.util.LinkedList;
import java.util.Queue;

public class WhiteRabbit implements Manager {

    private static final Manager MANAGER_INSTANCE = new WhiteRabbit();
    Queue<Witness> witnesses = new LinkedList<>();

    private WhiteRabbit() {
    }

    public static Manager getRabbitInstance() {
        return MANAGER_INSTANCE;
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
