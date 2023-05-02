package Task2;

import java.util.Scanner;

import Task2.View.ViewMenu;


public class Main {

    private static ViewMenu viewMenu;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        viewMenu= new ViewMenu();
        viewMenu.ViewMenuUser(input);
        input.close();  
    }
    
}