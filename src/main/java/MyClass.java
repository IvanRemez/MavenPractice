import java.math.BigDecimal;
import java.util.Set;

public abstract class MyClass {

    public abstract Set<Character> myMethod(char[] ch);

    public BigDecimal num;

    public void method1(){
        num = num.multiply(BigDecimal.valueOf(2));
    }
}
