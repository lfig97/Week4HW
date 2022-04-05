package polymorphism;

import java.util.Scanner;

public class Pet {
    private String name;
    private String sound;

    public String speak(){

        return getSound();
    }

    public String getSound() {
        return sound;
    }

    public void setSound() {
        Scanner input = new Scanner(System.in);
        System.out.println("What sound does this pet make?");
        this.sound = input.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your pet's name?");
        this.name = input.nextLine();
    }

}
