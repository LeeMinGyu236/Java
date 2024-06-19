package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] seasons = {"Spring", "Summer", "Autumn", "Winter"};

        System.out.println("season[0] : " + seasons[0]);
        System.out.println("season[1] : " + seasons[1]);
        System.out.println("season[2] : " + seasons[2]);
        System.out.println("season[3] : " + seasons[3]);

        seasons[1] = "여름";
        System.out.println("season[1] : " + seasons[1]);
        System.out.println();

        int[] scores = {83, 90, 87};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균 : " + avg);
    }
}
