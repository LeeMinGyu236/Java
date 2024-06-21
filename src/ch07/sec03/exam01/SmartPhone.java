package ch07.sec03.exam01;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String colors) {
        super();
        this.model = model;
        this.color = colors;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨.");
    }
}
