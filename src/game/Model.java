package game;


import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<Integer> statistic = new ArrayList<>();
    private int min;
    private int max;
    private static final int MAX_VALUE = 100;
    private int randomNumber;

    public int rand(int min, int max) {
        this.min = min;
        this.max = max;
        randomNumber = (int) ((Math.random() * (max - min)) + min);
        return randomNumber;
    }

    public int rand() {
        max = MAX_VALUE;
        randomNumber = (int) (Math.random() * (MAX_VALUE));
        return randomNumber;
    }


    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setStatistic(int number){
        statistic.add(number);
    }

    public List<Integer> getStatistic() {
        return statistic;
    }
}
