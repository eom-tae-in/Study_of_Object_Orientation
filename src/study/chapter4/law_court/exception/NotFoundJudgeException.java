package src.study.chapter4.law_court.exception;

public class NotFoundJudgeException extends IllegalArgumentException {
    public NotFoundJudgeException() {
        System.out.println("입력하신 정보에 맞는 판사를 찾을 수 없습니다. 다시 입력해주세요");
    }
}
