package Task2.Model;

import java.util.ArrayList;
import java.util.Random;

public class ToyStore {
    private ArrayList<ToyMachine> toys;
    private int totalProbability;

    public ToyStore() {
        toys = new ArrayList<>();
        totalProbability = 0;
    }

    public void addToy(ToyMachine toy) {
        toys.add(toy);
        totalProbability += toy.getChanceToy();
    }

    public void initToy() {
        addToy(new ToyMachine(1, "Car", 8, 7.5));
        addToy(new ToyMachine(2, "Ball", 5, 6.0));
        addToy(new ToyMachine(3, "Train", 4, 20.5));
        addToy(new ToyMachine(4, "Soldier", 15, 30.0));
    }

    public void updateToyProbability(int id, Double chanceToy) {
        for (ToyMachine toy : toys) {
            if (toy.getId() == id) {
                totalProbability -= toy.getChanceToy();
                toy.setChanceToy(chanceToy);
                totalProbability += chanceToy;
                break;
            }
        }
    }

    public void showToys() {
        System.out.println("Список доступных призов:");
        for (ToyMachine toy : toys) {
            System.out.println(toy.getName() + " (id: " + toy.getId() + ", количество: " + toy.getCountToy() + ", вес: " + toy.getChanceToy() + ")");
        }
    }

    public String play() {
        Random random = new Random();
        ToyMachine winToy;
        int randomNumber = random.nextInt(totalProbability);
        int sum = 0;
        for (ToyMachine toy : toys) {
            sum += toy.getChanceToy();
            if (sum > randomNumber) {
                System.out.println("Победила игрушка " + "\"" + toy.getName() + "\""+ "!");
                toy.setCountToyForPlay(toy.getCountToy());
                updateToyProbability(toy.getId(), toy.getChanceToy());
                return String.format("Название: %s; Вес: %d;", toy.getName(), toy.getId());
                
            }
        }
        return String.format("без выйигрыша");


        
    }
    
}
