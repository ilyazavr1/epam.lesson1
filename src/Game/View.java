package Game;


import java.util.List;

public class View {

    public void printMinMax(int min, int max) {
        System.out.printf("Min: %d   Max: %d\n", min, max);
    }

    public void printRange(int min, int max) {
        System.out.printf("[%d - %d]\n", min, max);
    }

    public void printRange(String str, int min, int max) {
        System.out.printf("%s \nRange: [%d - %d]\n", str, min, max);
    }

    public void printWarning() {
        System.out.println("Input integer!");
    }

    public void printStatistic(String str, List<Integer> list) {
        System.out.printf("%s \n%s", str, list.toString());
    }




}
