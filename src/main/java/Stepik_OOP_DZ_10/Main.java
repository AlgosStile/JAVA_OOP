package Stepik_OOP_DZ_10;

public class Main {
    public static void main(String[] args) {

        try {
            Dog dog1 = new Dog("Mastif", "big", 4);
            dog1.getInfo();
            Dog dog2 = new Dog("Freebreed", "big", -2);
            dog2.getInfo();
        } catch (NegativeAgeException e){
            System.out.println(e.toString());
        }
    }
}
