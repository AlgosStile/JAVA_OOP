package Stepik_OOP_GeomFigurs;

public class GeomFigures {
    public static void main(String[] args) {
        System.out.println("Project geometric figures");

        Rectangle rect = new Rectangle(5, 5, 10, 15);
        Circle circle = new Circle(7, 7, 12);

        System.out.println("Perimetr rect:"+rect.getPerimeter()+", area rect:"+rect.getArea());
        System.out.println("Perimetr circle:"+circle.getPerimeter()+", area circle:"+circle.getArea());
        rect.drawOnScreen(2.5f);
        rect.drawOnScreen(0, "black","white");

        //В оперативной памяти создаем ссылку на класс типа Figure, но засовываем
        //туда объект от наследника этого класса, от Rectangle
        Figure figure = new Rectangle(5, 5, 10, 15);

        System.out.println("Work with square:");

        Square square = new Square(5,5,3);
        System.out.println("Perimetr square:"+square.getPerimeter()+", area square:"+square.getArea());






    }
}
