package lesson5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamLesson {

    public static void main(String[] args) {
        int[] intArray = IntStream.range(-20, 20).toArray();
        intArray[4] = 255;
        intArray[6] = 0;
        intArray[30] = -2;
        intArray[8] = 24;

        double average = Arrays.stream(intArray).average().getAsDouble();
        int minValue = Arrays.stream(intArray).min().getAsInt();
        int minIndex = Arrays.stream(intArray).boxed().collect(Collectors.toList()).indexOf(minValue);
        int zeroEquals = (int) Arrays.stream(intArray).filter(i -> i == 0).count();
        int moreThenZero = (int) Arrays.stream(intArray).filter(i -> i > 0).count();


        System.out.println(Arrays.toString(intArray));


        System.out.println("Average = " + average + "\n" +
                "Min  = " + minValue + "\n" +
                "Min index  = " + minIndex + "\n" +
                "Equals zero elements  = " + zeroEquals + "\n" +
                "More then zero elements  = " + moreThenZero + "\n\n" +
                "Array multiplied by 5");

        System.out.println(Arrays.stream(intArray).map(i -> i *5).boxed().collect(Collectors.toList()));

    }

}
