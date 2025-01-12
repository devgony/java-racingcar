package racingcar;

import java.util.List;

public class ResultView {
    public static void printResult(List<Car> cars, int n) {
        System.out.printf("Race result(phase: %d)\n", n);
        for (Car car : cars) {
            System.out.println(car.getTrack());
        }
        System.out.println();
    }
}
