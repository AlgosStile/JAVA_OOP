package Stepik_OOP_Nursery;

public class Cat extends Animal{
    public Cat(String type) {//добавляем конструктор
        super(type);
    }

    @Override
    boolean aet(float weigth, String food) {
        return true;
    }

    @Override
    int sleep() {
        return 6;
    }
}
