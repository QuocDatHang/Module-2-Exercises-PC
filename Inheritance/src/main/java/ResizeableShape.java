import org.w3c.dom.css.Rect;

import java.util.Arrays;
import java.util.Random;

public class ResizeableShape {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int randomPercent = randomNumber.nextInt(100) + 1;
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle(3, 5);
        shape[2] = new Square(2);
        Circle c = (Circle) shape[0];
        Rectangle r = (Rectangle) shape[1];
        Square s = (Square) shape[2];
        System.out.println("Before resize :");
        for (Shape s1 : shape) {
            if (s1 instanceof Circle) {
                Circle s2 = (Circle) s1;
                System.out.printf("%s %.3f \n", "Circle : ", s2.getArea());
            } else if (s1 instanceof Rectangle && !(s1 instanceof Square)) {
                Rectangle s2 = (Rectangle) s1;
                System.out.printf("%s %.3f \n", "Rectangle : ", s2.getArea());
            } else if (s1 instanceof Square) {
                Square s2 = (Square) s1;
                System.out.printf("%s %.3f \n", "Square : ", s2.getArea());
            } else {
                System.out.println("The shape is not recognized as any specific type");
            }
        }

        c.resize(randomPercent);
        r.resize(randomPercent);
        s.resize(randomPercent);

        System.out.println("After resize :");
        for (Shape s1 : shape) {
            if (s1 instanceof Circle) {
                Circle s2 = (Circle) s1;
                System.out.printf("%s %.3f \n", "Circle : ", s2.getArea());
            } else if (s1 instanceof Rectangle && !(s1 instanceof Square)) {
                Rectangle s2 = (Rectangle) s1;
                System.out.printf("%s %.3f \n", "Rectangle : ", s2.getArea());
            } else if (s1 instanceof Square) {
                Square s2 = (Square) s1;
                s2.howToColor();
                System.out.printf("%s %.3f \n", "Square : ", s2.getArea());
            } else {
                System.out.println("The shape is not recognized as any specific type");
            }
        }
    }
}
