package 별찍기;

import java.util.Scanner;

public class 피라미드 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("프로그램을 종료하려면 777을 입력해주세요.");
            System.out.println("숫자를 입력해주세요. : ");
            int num;
            num = scanner.nextInt();

            if (num == 777) {
                break;
            }
            //음 일정 범위 앞에 띄워두고? 아니면 홀수개의 공백을 두고 가운데 넣기? / 이게 아님, 한쪽에만 공백을 만듦.
            //크리스마스 트리는 밑으로 갈수록 2개씩 증가해야함. 근데 그게 누적적으로 2개씩
            //그러면 입력칸을 홀수로만 입력하게 해야하는거 아닌가? 짝수는 균형이 안맞음.
            for (int i = 1; i < num; i += 2) { //10입력시 5줄이 나옴. ex) 1 3 5 7 9 총 5번의 입력값이 j로 넘어감
                for (int j = num - 1; j > i; j -= 2) { // 4번 반복됨. 따라서 4개의 여백이 출력
                    System.out.print(" "); //
                }
                for (int k = 0; k < i; k++) { //위의 i값으로 13579로 만들어짐
                    System.out.print("*");
                }


                System.out.println();
            }
        }
        System.out.println("프로그램 종료");
    }
}

