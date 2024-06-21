package 별찍기;

import java.util.Scanner;

public class 마름모 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num;
            System.out.println("프로그램을 종료하려면 777을 입력하세요.");
            System.out.println("숫자를 입력하세요 : ");
            num = scanner.nextInt();
            if (num == 777) {
                break;
            }
            for (int i = 1; i < num; i += 2) {

            }

        }
        System.out.println("프로그램을 종료합니다.");
    }
}
