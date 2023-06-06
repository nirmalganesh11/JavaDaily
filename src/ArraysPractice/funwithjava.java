package ArraysPractice;

import java.util.Random;
import java.util.stream.Stream;

public class funwithjava {
    public static void main(String[] args) {
        System.out.println(new Random().nextInt(100));
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));
        randomNumbers.limit(20).forEach(System.out::println);
    }
}
