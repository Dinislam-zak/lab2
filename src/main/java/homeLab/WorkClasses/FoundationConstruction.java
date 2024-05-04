package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class FoundationConstruction extends WorkingProcessArray {
    long duration = 14;
    @Override
    public void run() {
        while (!arrayWorkingProcess[1]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Start Foundation Construction");
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Foundation Construction");
        arrayWorkingProcess[4] = true;
    }
}