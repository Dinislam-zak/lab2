package lab4.functional;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunction {
    private static final Integer i = 52;
    public static void functionTest(Function<Integer,Double> function) {
        System.out.println(function.apply(i));
    }

    public static void main(String[] args) {
        functionTest(new MyFunction());

        functionTest(new Function<Integer,Double> (){
            public Double apply(Integer integer) {
                return Math.sqrt(integer);
            }

        });

        functionTest(n -> {return Math.sqrt(n);});
        functionTest(n -> Math.sqrt(n));
        functionTest(Math::sqrt);
    }
    static class MyFunction implements Function<Integer, Double> {

        @Override
        public Double apply(Integer integer) {
            return Math.sqrt(integer);
        }
    }


}

