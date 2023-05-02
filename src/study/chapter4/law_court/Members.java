package src.study.chapter4.law_court;

import src.study.chapter4.law_court.exception.NotFoundJudgeException;
import src.study.chapter4.law_court.exception.NotFoundRabbitException;
import src.study.chapter4.law_court.judge.King;
import src.study.chapter4.law_court.judge.Queen;
import src.study.chapter4.law_court.manager.WhiteRabbit;
import src.study.chapter4.law_court.witness.Alice;
import src.study.chapter4.law_court.witness.Chef;
import src.study.chapter4.law_court.witness.HatSeller;
import java.util.Arrays;
import java.util.List;

public enum Members {

    KING(Role.JUDGE) {
        @Override
        public Judge getJudge() {
            return King.getJudgeInstance();
        }
    },
    QUEEN(Role.JUDGE, Role.WITNESS) {
        @Override
        public Judge getJudge() {
            return Queen.getJudgeInstance();
        }

        @Override
        public Witness getWitness() {
            return Queen.getWitnessInstance();
        }
    },
    WHITE_RABBIT(Role.RABBIT) {
        @Override
        public Manager getRabbit() {
            return WhiteRabbit.getRabbitInstance();
        }
    },
    ALICE(Role.WITNESS) {
        @Override
        public Witness getWitness() {
            return Alice.getWitnessInstance();
        }
    },
    CHEF(Role.WITNESS) {
        @Override
        public Witness getWitness() {
            return Chef.getWitnessInstance();
        }
    },
    HAT_SELLER(Role.WITNESS) {
        @Override
        public Witness getWitness() {
            return HatSeller.getWitnessInstance();
        }
    };

    private final Role[] role;

    Members(Role ...role) {
        this.role = role;
    }

    public static List<Witness> getWitnesses() {
        return Arrays.stream(values()).filter(member -> Arrays.asList(member.role).contains(Role.WITNESS))
                .map(Members::getWitness).toList();
    }

    static Judge checkJudgeMember(String checkingMember) {
        return Arrays.stream(values()).filter(member -> member.toString().equals(checkingMember))
                .filter(member -> Arrays.asList(member.role).contains(Role.JUDGE)).map(Members::getJudge)
                .findAny().orElseThrow(NotFoundJudgeException::new);
    }

    static Manager checkRabbitMember(String checkingMember) {
        return Arrays.stream(values()).filter(member -> member.toString().equals(checkingMember))
                .filter(member -> Arrays.asList(member.role).contains(Role.RABBIT)).map(Members::getRabbit)
                .findAny().orElseThrow(NotFoundRabbitException::new);
    }

    public Judge getJudge() {
        return null;
    }

    public Manager getRabbit() {
        return null;
    }

    public Witness getWitness() {
        return null;
    }
}
