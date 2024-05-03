package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class CompletionOfConstruction extends WorkingProcessArray {
    @Override
    public void run() {
        while (true) {
            boolean flag = true;
            for (boolean b : arrayWorkingProcess) {
                flag = b && flag;
            }
            if (flag) break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Start completion of construction");
        System.out.println("End completion of construction");

        stopCount();
        System.out.println(getDays());
    }
}