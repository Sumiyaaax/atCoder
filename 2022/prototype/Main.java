import framework.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("a", upen);
        manager.register("b", mBox);
        manager.register("c", sBox);

        Product p1 = manager.create("a");
        p1.use("Hello, World.");
        Product p2 = manager.create("b");
        p2.use("Hello, World.");
        Product p3 = manager.create("c");
        p3.use("Hello, World.");
    }
}