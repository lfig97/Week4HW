package polymorphism;

public class Cat extends Pet{


    @Override
    public String speak() {
        String sound = "meow";
        return sound;
    }

}
