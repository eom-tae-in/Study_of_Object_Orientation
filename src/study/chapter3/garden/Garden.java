package src.study.chapter3.garden;

public class Garden {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        output.printAskMember();
        Member member = GardenMemberInfo.getMember(input.member());
        member.walking();
        member.introduction();
    }
}
