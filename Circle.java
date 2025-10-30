import java.text.Format;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI*radius*radius *100)/100.0;
    }

    @Override
    public double calculateCircumference() {
        return Math.round(2*Math.PI*radius *100)/100.0;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "\n\tRadius:        " + getRadius() +
                "\n\tArea:          " + calculateArea() +
                "\n\tCircumference: " + calculateCircumference();
    }
}
