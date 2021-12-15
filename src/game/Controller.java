package game;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void playGame() {
        Scanner sc = new Scanner(System.in);
        int randNum;
        int inputNum;
        boolean result = false;

        model.rand();
        randNum = model.getRandomNumber();
        view.printMinMax(model.getMin(), model.getMax());

        do {

            while (!sc.hasNextInt()) {
                view.printWarning();
                sc.nextLine();
            }
            inputNum = sc.nextInt();


            if (inputNum < model.getMin() || inputNum > model.getMax()) {
                model.setStatistic(inputNum);
                view.printRange("Out fo range", model.getMin(), model.getMax());
                continue;
            }

            if (inputNum < randNum) {
                model.setStatistic(inputNum);
                model.setMin(inputNum);
                view.printRange("More", model.getMin(), model.getMax());
            } else if (inputNum > randNum) {
                model.setStatistic(inputNum);
                model.setMax(inputNum);
                view.printRange("Less", model.getMin(), model.getMax());
            } else {
                model.setStatistic(inputNum);
                view.printStatistic("You won!", model.getStatistic());
            }


        } while (inputNum != randNum);


    }


}
