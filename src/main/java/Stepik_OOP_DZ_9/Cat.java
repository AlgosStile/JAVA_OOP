package Stepik_OOP_DZ_9;

class Cat implements Voiceable{

    public String breed;
    public String size;
    public int age;

    Cat(String breed, String size, int age) {
       this.breed = breed;
       this.size = size;
       this.age = age;
    }

    @Override
    public void makeVoice() {
        System.out.println("Meow Meow Meow");
    }

}
