package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class LayingСommunications extends WorkingProcessArray {
    long duration = 4;
    @Override
    public void run() {
        while (!arrayWorkingProcess[4]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Start Laying Communications");
            try {
                Thread.sleep(1000*duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End Laying Communications");
            arrayWorkingProcess[5] = true;
        }
    }
}