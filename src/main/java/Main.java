public class Main implements MyInterface{

    public static void main(String[] args) {

        MyInterface myInterface = new Main();

        myInterface.method1();

        myInterface.method2(5);

    }

    @Override
    public void method1() {

    }

    @Override
    public Boolean method2(int n) {
        return null;
    }
}
