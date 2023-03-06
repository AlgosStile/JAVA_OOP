package Stepik_OOP_Nursery;

import java.util.Date;

public abstract class Animal implements Alertable {//Создаем класс Animal и перечислим все поля
    //которые будут объединять всех животный
    private String type;//какое именно животное: собака, кошка, крокодил и т. д.
    private String size;
    private int age;
    private String color;
    private Date dateArrived;//поле когда животное появилось в питомнике

    public Animal(String type) {    //Это конструктор
        this.type = type;           //для главного класса
        this.dateArrived = new Date();// Animal
        this.size = "medium";
        this.age = 0;
    }

    Animal(String size, int age, String color, String type) {

        this.dateArrived = new Date();
        this.size = size;
        this.age = age;
        if (color != null) { // проверка, если переданный цвет не равен нул, то тогда своему полю color
            // присваиваем переданное значение
            this.color = color;
        }
    }

    abstract boolean aet(float weigth, String food);//объявляем метод без тела {....},

    //потому что каждый конкретный класс будет реализ. этот метод по своему
    abstract int sleep();

    public final int sit() {
        //возвращает сколько дней животное находится в питомнике
        Date currentDate = new Date();
        //int days = (int)(currentDate.getTime() - this.dateArrived.getTime()) / (60*60*24*1000);
        int second = (int) (currentDate.getTime() - this.dateArrived.getTime()) / (1000);
        //return days;
        return second;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void alertError(int num) {
        System.out.println("error occured:"+this.convertAlertErrorMessage(num));
    }

    @Override
    public void alertWarning(int num) {
        System.out.println("warning occured:"+this.convertAlertWarningMessage(num));

    }

    @Override
    public String convertAlertErrorMessage(int num) {
        return ListErrorsWarnings.ListErrors[num];
    }

    @Override
    public String convertAlertWarningMessage(int num) {
        return ListErrorsWarnings.ListWarnings[num];


    }
}
