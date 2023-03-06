package Stepik_OOP_DZ_1;

class Dog{
    private String breed;
    private String size;
    private int age;

    Dog(String breed, String size, int age){

        this.breed = "Mastif";
        this.size = "big";
        this.age = 7;

    }

    void getInfo(){
        String big;
        System.out.println("breed:"+"Mastif"+"," + " " + "size:"+"big"+","+" "+"age:"+"7");
    }
}




