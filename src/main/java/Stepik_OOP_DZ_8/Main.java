package Stepik_OOP_DZ_8;

public class Main {
    public static void main(String[] args) {

        Figure rect = new Rectangle(5, 5, 10, 15);
        Figure circle = new Circle(7, 7, 12);

        System.out.println("Perimetr rect:" + rect.getPerimeter() );
        System.out.println("Perimetr circle:" + circle.getPerimeter() );
    }
}