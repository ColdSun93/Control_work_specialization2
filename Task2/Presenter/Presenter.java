package Task2.Presenter;

// import java.util.ArrayList;
import java.util.Scanner;

// import Task2.Model.ToyMachine;
import Task2.Model.ToyStore;
import Task2.Model.Winning;
import Task2.View.ViewMenu;

public class Presenter {

    private ViewMenu mView;
    private Winning winning;
    private ToyStore pToyStore;

    public Presenter(ViewMenu mView) {
        this.mView = mView;
        this.pToyStore = pToyStore;

    }

    public void operationNum(int key, Scanner input) {
        pToyStore = new ToyStore();
        pToyStore.initToy();
        winning = new Winning();

        switch (key) {
            case 1:
                System.out.println("Игрушки в автомате:");
                pToyStore.showToys();
                break;
            case 2:
                // pToyStore.play();
                
                winning.addToyWinning(pToyStore.play());
                winning.collectWinnings();
                pToyStore.showToys();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Недопустимая команда");
        }

    }

}
