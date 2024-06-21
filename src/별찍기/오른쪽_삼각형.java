package 별찍기;
//1. 오른쪽에서 시작하려면 왼쪽에 num의 증감만큼 반비례하게 공백을 만들어야할듯?
//2. 그냥 옆으로 정렬하기 만들면 안되려나? 할 줄 모르겠음.
//3. 아니면 왼쪽_역삼각형을 "*"이 아닌 ""로 만들면 나머지는 별로 나오게 해도 될듯
//기본 틀은 삼각형 찍기랑 비슷한 상태에서 추가되지 않을까 하는 생각.

import java.util.Scanner;

public class 오른쪽_삼각형 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num;
            System.out.println("프로그램을 종료하려면 777을 입력하세요");
            System.out.print("삼각형의 크기는?: ");
            num = scanner.nextInt();
            if (num == 777) {
                break;
            }
            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= num - i; j++) {
                    System.out.print(" ");
                }
                for (int m = 0; m <= i; m++) {
                    System.out.print("*");
                }
                System.out.println();
            }
//            for (int i = 1 ; i <= 5 ; i++ ) {
//                for (int j = 1 ; j <= 5-i; j++ ) {
//                    System.out.print(" ");
//                }
//                for (int m = 1; m <= i; m++ ) {
//                    System.out.print("*");
//                }
//                System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
