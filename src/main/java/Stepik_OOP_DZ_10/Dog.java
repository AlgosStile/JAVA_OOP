package Stepik_OOP_DZ_10;

class Dog {

    private String breed;
    private String size;
    int age;

    Dog(String breed, String size, int age) throws NegativeAgeException {

        this.size = size;
        this.breed = breed;
        this.age = age;


        if (age < 0) {
            throw new NegativeAgeException(age);


        }
    }

    void getInfo() {

        System.out.println("breed:" +breed+ "," + " " + "size:" + size + "," + " " + "age:" + age);

    }
}

