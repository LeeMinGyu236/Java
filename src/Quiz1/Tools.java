package Quiz1;//조건 1. 유저가 입력하 숫자만큼의 크기에 해당하는 도형을 출력하는 프로그램을 만든다.
//ex)유저가 3을 입력했을 때 6을 입력했을때 출력할 도형의 크기가 다름.
//마름모 7크기시 중간을 중심으로 위아래 1칸씩 줄어듦,

//조건 2. 유저가 프로그램 종료를 선택하지 않는 이상 계속 프로그램을 실행함.
// 이거는 !equals= q 를 이용하면 될듯.

//위의 조건으로 1)삼각형, 2)사각형 3)마름모 4)육각형 5)원 6)별

import java.util.Scanner;

public class Tools {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num;
            System.out.println("프로그램을 종료하려면 777을 입력하세요");
            System.out.print("삼각형의 크기는?: ");
            num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (num == 777) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
