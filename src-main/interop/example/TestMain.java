package interop.example;
import interop_blog.core.Calculator;

public class TestMain {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        ICalculator calc = new Calculator(100);
        System.out.println(calc.multiply(input));
    }
}
