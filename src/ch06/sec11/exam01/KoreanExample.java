package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "이민규");

        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        k1.name = "김민규";
    }
}
