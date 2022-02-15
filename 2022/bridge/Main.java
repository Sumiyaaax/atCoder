
public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        Display1 d1 = new Display1(new StringDisplayImpl("Hello, Japan."));
        System.out.println(2);
        Display1 d2 = new CountDisplay(new StringDisplayImpl("Hello, Japan."));
        System.out.println(3);
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Japan."));
        System.out.println(4);
        System.out.println(d1);
        d1.display();
        System.out.println(5);
        d2.display();
        System.out.println(6);
        d3.display();
        System.out.println(7);
        d3.multiDisplay(5);
    }
}