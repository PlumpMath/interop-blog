package interop.example;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class CalculatorFactory2 {
    public static ICalculator newCalculator(int operand) {
    	IFn require = Clojure.var("clojure.core","require");
    	require.invoke(Clojure.read("interop_blog.core"));
    	IFn newCalcFn = Clojure.var("interop-blog.core", "new-reified-calc");
        return (ICalculator) newCalcFn.invoke(Integer.valueOf(operand));
    }
}
