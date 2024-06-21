package 별찍기;

import java.util.Scanner;

public class 육각형 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("프로그램을 종료하려면 777을 입력해주세요.");
            System.out.println("숫자를 입력하세요 :");
            int num = scanner.nextInt();

            if (num == 777) {
                break;
            }
            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
