import java.util.Optional;

public class FlatMapSample {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.ofNullable(getOpt());
        Optional<String> opt = getOptStr(optStr);
    }

    public static String getOpt() {
        String str = "Hello World";
        return str;
    }

    public static Optional<String> getOptStr(Optional<String> opt) {
        return opt;

    }
}