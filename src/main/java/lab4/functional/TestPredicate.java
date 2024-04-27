package lab4.functional;


import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestPredicate {
    private static final String s = "Hello";
    public static void predicateTest(Predicate<String> predicate) {
        System.out.println(predicate.test(s));
    }

    public static void main(String[] args) {
        predicateTest(new MyPredicate());

        predicateTest(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Hello");
            }

        });

        predicateTest(str -> {return str.equals("Hello!");});
        predicateTest(str -> str.equals("Hello"));
        Predicate <String> predicate = str -> str.equals("Hello");

        predicateTest(predicate);
    }
    static class MyPredicate implements Predicate<String> {

        @Override
        public boolean test(String s) {
            return s.equals("Hello");
        }
    }
}

