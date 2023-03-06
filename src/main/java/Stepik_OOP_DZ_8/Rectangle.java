package Stepik_OOP_DZ_8;

class Rectangle extends Figure {

    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getPerimeter() {
        return (width * 2 + height * 2);
    }
}
