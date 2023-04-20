package src.study.chapter2.Alice;

class Output {

    void printAskHeight() {
        System.out.println("Alice의 키를 입력해주세요: ");
    }

    void printSelectFoodQuestion() {
        System.out.println("Alice에게 어떤 음식을 먹일건가요?");
        System.out.println("고기를 먹일거면 meat, 채소를 먹일거면 vegetable을 입력해주세요");
    }

    void printQuantityQuestion() {
        System.out.println("얼마나 먹일건가요?");
    }

    void printFailEnterGarden() {
        System.out.println("Alice는 정원에 들어갈 수 없습니다.");
    }

    void printSuccessEnterGarden() {
        System.out.println("Alice가 정원에 들어갔습니다.");
    }
}
