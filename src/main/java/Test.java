import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Test extends MyClass{


    @Override
    public Set<Character> myMethod(char[] ch) {
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < ch.length; i++) {
            result.add(ch[i]);
        }
        return result;
    }
    public void method1(int n){

    }

    @Override
    public void method1() {
        super.method1();
    }
}
