package 별찍기;

//         ******
//        *********
//      **************
//        *********
//         ******
//
//        위에 몇개 i=3이런식으로 자르고 시작하면 위에 평평하게 나올듯?(마지막도 마찬가지)
//        2씩 증가하고 다시 최고점에서 감소.
//        num은 중간에 가장 넓은 점이 되야함.
//        =>마름모를 만든 다음에 하면되겠다.
///

import java.util.Scanner;

public class 왼쪽_역삼각별 {
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
            for (int i = num; 0 < i; i--) {
                // for(int i = 0; i < num; i++) 0부터 시작해서 num-1까지 가는데 1개씩 증가.
                // for(int i = num; i <= 0; i--)????? 오 맞다
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        System.out.println("프로그램 종료");
    }
}
