package Stepik_OOP_DZ_7;

class Dog extends Animal {

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    Dog(String breed, String size, int age){
        super(size, age);
        this.breed = breed;
    }
}