package Stepik_OOP_DZ_6;

class Dog{

    private String breed;
    private String size;
    private int age;

    Dog(String breed, String size, int age){

        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}