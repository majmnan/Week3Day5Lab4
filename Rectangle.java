public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculateCircumference() {
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "Rectangle:" +
                "\n\tWidth:         " + getWidth() +
                "\n\tHeight:        " + getHeight() +
                "\n\tArea:          " + calculateArea() +
                "\n\tPerimeter:     " + calculateCircumference();
    }
}
