import lombok.Getter;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class Test {
    @Getter
    private Integer x;
    @Getter
    private LinkedHashMap<BigDecimal, Boolean> linkedHashMap;
    protected static String str;

    public Test(Integer x) {
        setX(x);
    }

    private void setX(Integer xx) {
        if (x < -18) {
            throw new RuntimeException();
        } else {
            x = xx;
        }
    }
}
