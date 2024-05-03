package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class DoorInstallation extends WorkingProcessArray {
    long duration = 1;
    @Override
    public void run() {
        while (!arrayWorkingProcess[3] || !arrayWorkingProcess[7]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Start door installation");
            try {
                Thread.sleep(1000*duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End door installation");
            arrayWorkingProcess[9] = true;
        }
    }
}