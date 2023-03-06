package Stepik_OOP_Nursery;

public final class NegativeAgeException extends Throwable {
    private int value;
    public NegativeAgeException(int value) {
        this.value = value;

    }

    @Override
    public String toString() {
        String msg ="Exception: value of age: "+value+" is negative";
        return msg;
    }
}
