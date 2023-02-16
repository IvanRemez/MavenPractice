import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public LinkedList<BigDecimal> list(List<Long> longest) {
                return null;
            }
        };

        MyFunctionalInterface myFunctionalInterface1 = longest -> new LinkedList<>();
    }
}
