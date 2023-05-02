package Task2.Model;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Winning {
    private ArrayList<String> toys;

    public Winning() {
        toys = new ArrayList<>();
    }

    public void addToyWinning(String toy) {
        toys.add(toy);
    }

    public void collectWinnings() {
        System.out.println("Список доступных призов:");

        for (String toy : toys) {
            writeDataFile(toy);
            System.out.println(toy);

        }
    }

    public static void writeDataFile(String wrResult) {

        try (FileWriter wfile = new FileWriter("./Task2/Winning.txt", false)) {
            wfile.write(wrResult);
            wfile.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
