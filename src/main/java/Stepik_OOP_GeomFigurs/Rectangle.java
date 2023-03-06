package Stepik_OOP_GeomFigurs;

public class Rectangle extends Figure {

    private float width;//создаем поля
    private float height;//создаем поля

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Rectangle(float x, float y) {
        super(x, y);
    }

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.height = height;//прописываем значения для поля height
        this.width = width; //прописываем значения для поля width

    }

    @Override
    public float getPerimeter() {
        return (width * 2 + height * 2);//реализуем методы периметра
        //пример полиморфизма, или переопределение методов класса
        //основной класс был создан в Figure
    }

    @Override
    public float getArea() {
        return width * height; //реализуем методы площади
    }

    @Override
    public void drawOnScreen() {//наследуем этот класс от абстрактного класса Figure
        System.out.println("Прямоугольник здесь");
    }

    //реализуем перегрузку метода внутри класса drawOnScreen(),
    // это еще 1 пример полиморфизма когда заголовок drawOnScreen() один, но
    //набор праметров разные
    public void drawOnScreen(float scale) {
        System.out.println("Прямоугольник с масштабом: "+scale);

    }
    public void drawOnScreen(int type, String colorFill, String colorBorder) {
        System.out.println("Прямоугольник цветной");

    }


}
