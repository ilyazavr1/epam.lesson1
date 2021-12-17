package lesson2.countRepeatdinArrList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,-6,4,5,3,4,2,4,5,7 ));


        countRepeatedElements(list);
    }

    public static void countRepeatedElements(List<Integer> list) {
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for (Integer integer : list) {
            if (map.containsKey(integer)) {
                map.put(integer, (map.get(integer) + 1));
            } else {
                map.put(integer, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Number: " + entry.getKey() + " Count: " + entry.getValue());
        }

    }
}
