package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class RoofConstruction extends WorkingProcessArray {
    long duration = 3;
    @Override
    public void run() {
        while (!arrayWorkingProcess[6]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Start Laying Communications");
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Laying Communications");
        arrayWorkingProcess[7] = true;
    }
}