package src.study.chapter2.Alice;

public class Output {

    public static void printAskHeight() {
        System.out.println("Alice의 키를 입력해주세요: ");
    }

    public static void printSelectFoodQuestion() {
        System.out.println("Alice에게 어떤 음식을 먹일건가요? (UPPER_SNAKE_CASE로 입력해주세요.)");
    }

    public static void printNotEnoughFood() {
        System.out.println("재고가 부족합니다.");
        System.out.println("다시 입력해주세요.");
    }

    public static void printQuantityQuestion() {
        System.out.println("얼마나 먹일건가요?");
    }

    public static void printFailEnterGarden() {
        System.out.println("Alice는 정원에 들어갈 수 없습니다.");
    }

    public static void printSuccessEnterGarden() {
        System.out.println("Alice가 정원에 들어갔습니다.");
    }
}
