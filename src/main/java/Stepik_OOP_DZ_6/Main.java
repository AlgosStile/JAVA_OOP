package Stepik_OOP_DZ_6;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Mastif", "big", 7 );
        dog.setBreed("WhiteMastif");
        dog.setSize("middle");
        dog.setAge(5);
        System.out.println(dog.getBreed()+" "+dog.getSize()+" "+dog.getAge());

    }
}