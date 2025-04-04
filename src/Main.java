
public class Main {
    public static void main(String[] args) {
        // Operatie Integer: (10 + 5 - 3) * 2 = 24
        NewIntCalculator intCalc = new NewIntCalculator();
        intCalc.init(10).add(5).subtract(3).multiply(2);
        System.out.println("Integer result: " + intCalc.result());

        // Operatie Double: (10 + 5 - 3.3) * 2.2 = 25.74
        DoubleCalculator doubleCalc = new DoubleCalculator();
        doubleCalc.init(10.0).add(5).subtract(3.3).multiply(2.2);
        System.out.println("Double result: " + doubleCalc.result());
    }
}
