package src.study.chapter3.garden.exception;

public class NotFoundMemberException extends IllegalArgumentException{
    public NotFoundMemberException() {
        System.out.println("해당 멤버를 찾지 못했습니다. 다시 입력해주세요");
    }
}
