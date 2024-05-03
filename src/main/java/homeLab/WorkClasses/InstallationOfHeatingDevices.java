package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class InstallationOfHeatingDevices extends WorkingProcessArray {
    long duration = 3;
    @Override
    public void run() {
        while (!arrayWorkingProcess[5] || !arrayWorkingProcess[8] || !arrayWorkingProcess[9]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Start installation of heating devices");
            try {
                Thread.sleep(1000*duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End installation of heating devices");
            arrayWorkingProcess[10] = true;
        }
    }
}