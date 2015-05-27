package interop.example;

public class TestMain3 {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        ICalculator calc = CalculatorFactory.newCalculator(100);
        System.out.println(calc.multiply(input));
    }
}
