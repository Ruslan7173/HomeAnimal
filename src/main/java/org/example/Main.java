package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("   ");

    }

    public static Pet[] make3Pets() {
        Pet[] pets = {new Dog("Bob"),
                new Cat("Tom"),
                new Cat("Tom2")
        };
        return pets;
    }

    public static String [] converPetsToSounda(Pet[] pets) {
        String  a;
        String [] sound = new  String[pets.length];
        for (int i= 0; i<sound.length; i ++ ){
            sound [i] = pets[i].makeSound();

        }

        return  sound;



    }


}


