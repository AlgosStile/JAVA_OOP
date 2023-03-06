package Stepik_OOP_Nursery;

public class Dog extends Animal{ //объявляем класс Dog(собака)

    // указываем поля класса, которые связаны с нашим объектом
    private String breed;//наводим курскор на breed и нажимаем alt+Enter - выбираем getter или setter

    // Указываем конструкторы класса
    //Создаем 1 конструктор класса (без параметров)
    Dog(String type) {
        super(type);
        //this указывает на текущий класс с которым мы рабтаем, то есть сам на себя
        this.breed = "unknown";

    }
    //Создаем 2 конструктор класса
    Dog(String breed, String size, int age, String color, String type) {
        super(size, age, color, type);
        this.breed = breed;
        if(size.equals("big")) {
            this.alertWarning(1);

        }

    }



    //Методы класса (в качестве названия используют глагол и пишутся с маленькой буквы)
    boolean aet (float weigth, String food) {// заголовок метода с входными полями
        // тут будет code
        return true;
    }

      int sleep() { // заголовок метода с входными полями
        //....code
        return 5;
    }

    float run(int task) { // заголовок метода с входными полями
        //собака выполняет упражнение
        // code
        return 0.42f;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
