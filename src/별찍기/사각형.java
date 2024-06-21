package 별찍기;

import java.util.Scanner;

public class 사각형 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int num;
            System.out.println("프로그램을 종료하려면 777을 입력해주세요.");
            System.out.println("숫자를 입력해주세요 : ");
            num = sc.nextInt();

            if (num == 777) {
                break;
            }
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    //여기서 j < i으로 설정 (삼각형 : j < num)
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
