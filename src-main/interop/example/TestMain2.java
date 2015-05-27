package interop.example;
import interop_blog.core.Calculator;
import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class TestMain2 {
    public static void main(String[] args) {
    	IFn require = Clojure.var("clojure.core","require");
    	require.invoke(Clojure.read("interop_blog.core"));

        int input = Integer.parseInt(args[0]);
        ICalculator calc = new Calculator(100);
        System.out.println(calc.multiply(input));
    }
}
