package Fibonacci;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Fibonacci {
    public Integer streamWay(int number) {
        return CalculateToReturn(number);
    }

    private int CalculateToReturn(int number) {
        number = number + 1;
        List fiboList = Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(number)
                .map(n -> n[0])
                .collect(toList());
        return (int) fiboList.get(fiboList.size() - 1);
    }

    public Integer iterateWay(int number) {
        if (number <= 0) return 0;
        if (number == 1) return 1;
        if (number == 2) return 1;
        int first = 0;
        int second = 1;
        int fibonacci = 0;
        for (int i = 0; i < number - 1; i++) {
            fibonacci = first + second;
            first = second;
            second = fibonacci;
        }
        return fibonacci;
    }

    public Integer recursiveWay(int number) {
        if (number <= 0) return 0;
        if (number == 1) return 1;
        else return recursiveWay(number-1) + recursiveWay(number - 2);
    }
}

