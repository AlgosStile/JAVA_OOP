package Stepik_OOP_DZ_8;

abstract class Figure {

   private float x;
   private float y;

    public Figure(float x, float y) {
      this.x = x;
      this.y = y;

    }
    public abstract float getPerimeter();

}
