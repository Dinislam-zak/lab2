package labParallelStream;

public class MainThread {
    public static void main(String[] args) {
        String data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eu magna eros. Fusce eget condimentum est. Donec id cursus odio. Cras pellentesque, enim ut consectetur sollicitudin, diam ex feugiat dolor, faucibus tincidunt ipsum mi in tortor. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Morbi id condimentum enim. Proin venenatis, nisl non vestibulum aliquam, odio lectus interdum risus, id consectetur magna libero convallis nunc. Ut sed velit magna. Aenean tempus tellus sit amet ipsum hendrerit, in convallis nunc bibendum.";

        Thread thread1 = new Thread(new Task(data));
        Thread thread2 = new Thread(new Task(data));
        thread1.start();

    }
}
