package src.study.chapter4.law_court;

import src.study.chapter4.law_court.exception.NotFoundJudgeException;
import src.study.chapter4.law_court.exception.NotFoundRabbitException;
import java.util.Arrays;
import java.util.List;

enum Members {

    KING(Role.JUDGE) {
        @Override
        Judge getJudge() {
            return King.getJudgeInstance();
        }
    },
    QUEEN(Role.JUDGE, Role.WITNESS) {
        @Override
        Judge getJudge() {
            return Queen.getJudgeInstance();
        }

        @Override
        Witness getWitness() {
            return Queen.getWitnessInstance();
        }
    },
    WHITE_RABBIT(Role.RABBIT) {
        @Override
        Rabbit getRabbit() {
            return WhiteRabbit.getRabbitInstance();
        }
    },
    ALICE(Role.WITNESS) {
        @Override
        Witness getWitness() {
            return Alice.getWitnessInstance();
        }
    },
    CHEF(Role.WITNESS) {
        @Override
        Witness getWitness() {
            return Chef.getWitnessInstance();
        }
    },
    HAT_SELLER(Role.WITNESS) {
        @Override
        Witness getWitness() {
            return HatSeller.getWitnessInstance();
        }
    };

    private final Role[] role;

    Members(Role ...role) {
        this.role = role;
    }

    static List<Witness> getWitnesses() {
        return Arrays.stream(values()).filter(member -> Arrays.asList(member.role).contains(Role.WITNESS))
                .map(Members::getWitness).toList();
    }

    static Judge checkJudgeMember(String checkingMember) {
        return Arrays.stream(values()).filter(member -> member.toString().equals(checkingMember))
                .filter(member -> Arrays.asList(member.role).contains(Role.JUDGE)).map(Members::getJudge)
                .findAny().orElseThrow(NotFoundJudgeException::new);
    }

    static Rabbit checkRabbitMember(String checkingMember) {
        return Arrays.stream(values()).filter(member -> member.toString().equals(checkingMember))
                .filter(member -> Arrays.asList(member.role).contains(Role.RABBIT)).map(Members::getRabbit)
                .findAny().orElseThrow(NotFoundRabbitException::new);
    }

    Judge getJudge() {
        return null;
    }

    Rabbit getRabbit() {
        return null;
    }

    Witness getWitness() {
        return null;
    }
}
