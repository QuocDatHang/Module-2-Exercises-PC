public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    Rectangle() {

    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return (this.width + this.length) * 2;
    }
    public String toString(){
        return "A Rectangle with width= "
                + getWidth()
                + " and length= "
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
