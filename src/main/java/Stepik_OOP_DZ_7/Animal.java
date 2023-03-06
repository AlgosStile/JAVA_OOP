package Stepik_OOP_DZ_7;

abstract class Animal{

    private String size;
    private int age;

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Animal(String size, int age){
        this.size = size;
        this.age = age;
    }
}