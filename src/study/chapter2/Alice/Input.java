package src.study.chapter2.Alice;

import java.util.Scanner;

public class Input {

    static Scanner sc = new Scanner(System.in);
    public static int height() {
        return sc.nextInt();
    }
    public static String food() {
        return sc.next();
    }
    public static int quantity() {
        return sc.nextInt();
    }
}
