package ch05.sec06;

public class ArrayCreateByNewExample2 {
    public static void main(String[] args) {
        double[] array2 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("array2[" + i + "] = " + array2[i] + ",");
        }
        System.out.println();

        array2[0] = 0.1;
        array2[1] = 0.2;
        array2[2] = 0.3;

        for (int i = 0; i < 3; i++) {
            System.out.print("array2[" + i + "] = " + array2[i] + ",");
        }
        System.out.println();
    }
}
