package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class FloorFinishing extends WorkingProcessArray {
    long duration = 7;
    @Override
    public void run() {
        while (!arrayWorkingProcess[12]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Start floor finishing");
            try {
                Thread.sleep(1000*duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End floor finishing");
            arrayWorkingProcess[13] = true;
        }
    }
}