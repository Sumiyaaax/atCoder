package implement;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    public void printWeak() {
        showWithParan();
    }

    public void printStrong() {
        showWithAster();
    }
}