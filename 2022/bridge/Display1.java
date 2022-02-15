public class Display1 {
    private DisplayImpl impl;

    public Display1(DisplayImpl inpl) {
        this.impl = impl;
    }

    public void open() {
        System.out.println(impl);
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}