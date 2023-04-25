package src.study.chapter4.law_court.exception;

public class NotFoundWitnessException extends IllegalArgumentException {
    public NotFoundWitnessException() {
        System.out.println("목격자가 존재하지 않습니다.");
    }
}
