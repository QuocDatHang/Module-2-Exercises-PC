public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(1.2,2.3);
        System.out.println(rectangle1);

        rectangle1 = new Rectangle(10,20, "orange", true);
        System.out.println(rectangle1);

        rectangle1.resize(75);
        System.out.println(rectangle1);
    }
}
