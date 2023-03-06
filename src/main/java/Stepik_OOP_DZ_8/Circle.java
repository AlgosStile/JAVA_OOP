package Stepik_OOP_DZ_8;

class Circle extends Figure {

    private float radius;
    private final float PI = 3.14159f;

    public Circle(float x, float y, float radius) {
       super (x, y);
       this.radius = radius;
    }

    @Override
    public float getPerimeter() {
        return (radius * 2 * PI);
    }
}
