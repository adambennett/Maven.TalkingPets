package io.zipcoder.polymorphism;



import java.util.ArrayList;
import java.util.Scanner;

public class IO {

    private static ArrayList<Pet> pets;
    public static void main(String[] args){

        Integer numberOfPets = getIntegerInput("Hello User!  How many pets do you have?");
        if(numberOfPets == 0){
            System.out.println("Why are you even here?");
        }
        ArrayList<Pet> pet = new ArrayList<>();
        pets = pet;
        for (int i = 0; i < numberOfPets; i++) {
            String answer = getStringInput("What is one of your pets?");
            String name = getStringInput("What is their name?");
            if(answer.equalsIgnoreCase("cat")){
                pets.add(new Cat(name));
            }
            else if (answer.equalsIgnoreCase("fish")){
                pets.add(new Fish(name));
            }
            else if (answer.equalsIgnoreCase("dog")){
                pets.add(new Dog(name));
            }
            else {
                System.out.println("That pet does not exist!");
            }
        }
        printPets();
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) { e.printStackTrace(); }
        return 0;
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static void printPets(){
        for (Pet p : pets) {
            System.out.println(p.toString() + ": '" + p.speak()+"'");
        }
    }
}
