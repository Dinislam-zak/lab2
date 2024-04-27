package labParallelStream;

import java.util.ArrayList;
import java.util.List;

public class MainSum {
    public static void main(String[] args) {
        double SP = Math.sqrt(Math.PI);
        SumPart s1 = new SumPart(0,SP);
        long startTime = System.nanoTime();
        s1.run();
        double summ1 = s1.getPartSum();
        long endTime = System.nanoTime();

        System.out.println(summ1 + " : " + (endTime - startTime));

        int countOfThreads = Runtime.getRuntime().availableProcessors();

        double h = SP / countOfThreads;
        List<SumPart> thList = new ArrayList<>();
        for (int i = 0; i < countOfThreads; i++){
            thList.add(new SumPart(i * h,(i + 1) * h));
        }

        startTime = System.nanoTime();
        thList.forEach(t -> t.start());
        endTime = System.nanoTime();

        thList.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        double result = thList.stream()
                .mapToDouble(t -> t.getPartSum())
                .sum();

        System.out.println("кол-во потоков: " + countOfThreads);
        System.out.println(result + " : " + (endTime - startTime));
    }
}
