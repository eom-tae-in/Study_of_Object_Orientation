package src.study.chapter3.garden;

import src.study.chapter3.garden.exception.NotFoundMemberException;
import src.study.chapter3.garden.rabbit_members.BlackRabbit;
import src.study.chapter3.garden.trump_members.*;
import java.util.Arrays;

enum GardenMemberInfo {

    GARDENER("gardener", new Gardener()),
    SOLDIER("soldier", new Solider()),
    PRINCESS("princess", new Princess()),
    PRINCE("prince", new Prince()),
    GUEST("guest", new Guest()),
    HEART_JACK("heart_jack", new HeartJack()),
    HEART_KING("heart_king", new HeartKing()),
    HEART_QUEEN("heart_queen", new HeartQueen()),
    BLACK_RABBIT("black_rabbit", new BlackRabbit());

    private final String role;
    private final Member member;

    GardenMemberInfo(String role, Member member) {
        this.role = role;
        this.member = member;
    }

    static GardenMemberInfo checkMemberExist(String checkingMember) {
        return Arrays.stream(values()).filter(member -> member.role.equals(checkingMember))
                .findAny().orElseThrow(NotFoundMemberException::new);
    }

    static Member getMember(GardenMemberInfo gardenMemberInfo) {
        return gardenMemberInfo.member;
    }
}
