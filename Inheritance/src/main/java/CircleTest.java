import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(10, "indigo", false);
        System.out.println(circle);
        circle.resize(150);
        System.out.println(circle);
    }
}
