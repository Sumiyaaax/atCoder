
public class Main {
    public static void main(String[] args) {
        Display1 d1 = new Display1(new StringDisplayImpl("Hello, Japan."));
        Display1 d2 = new CountDisplay(new StringDisplayImpl("Hello, Japan."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Japan."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}