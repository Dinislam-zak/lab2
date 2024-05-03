package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class Walling extends WorkingProcessArray {
    long duration = 14;
    @Override
    public void run() {
        while (!arrayWorkingProcess[4]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Start Walling");
            try {
                Thread.sleep(1000*duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End Walling");
            arrayWorkingProcess[6] = true;
        }
    }
}