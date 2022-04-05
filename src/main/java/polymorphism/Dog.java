package polymorphism;

public class Dog extends Pet{


    @Override
    public String speak() {
        String sound = "woof";
        return sound;
    }


}
