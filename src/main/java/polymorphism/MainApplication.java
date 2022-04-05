package polymorphism;


import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <String> listOfPets = new ArrayList<>();
        System.out.println("How many pets do you have?");
        int numOfPets = input.nextInt();
        String petType = input.nextLine();
        for (int i = 0;i<numOfPets;i++){
            System.out.println("What kind of pet is pet #"+(i+1)+"?");
            petType = input.nextLine();
            if(petType.equalsIgnoreCase("lion")){
                Lion l = new Lion();
                l.setName();
                listOfPets.add(l.getName()+" "+l.speak());
            }
            else if(petType.equalsIgnoreCase("cat")){
                Cat c = new Cat();
                c.setName();
                listOfPets.add(c.getName()+" "+c.speak());
            }
            else if(petType.equalsIgnoreCase("dog")){
                Dog d = new Dog();
                d.setName();
                listOfPets.add(d.getName() +" "+d.speak());
            }
            else{
                Pet p = new Pet();
                p.setName();
                p.setSound();
                listOfPets.add(p.getName()+" "+p.speak());
            }
        }
        for(String pet:listOfPets){
            System.out.println(pet);
        }
    }
}
