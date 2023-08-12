import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(1.4);
        circles[2] = new Circle(0.7, "white", false);
        System.out.println("Pre sort");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After sort");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}