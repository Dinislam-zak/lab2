package lab4.functional;

import java.util.function.Consumer;

public class TestConsumer {
    private static final String s = "Hello";
    public static void accept(Consumer<String> consumer) {
            consumer.accept(s);
    }

    public static void main(String[] args) {
        accept(new MyConsumer());

        accept(new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });

        accept(str -> System.out.println(str));
        accept(System.out::println);
    }
    static class MyConsumer implements Consumer<String>{
        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    }
}
