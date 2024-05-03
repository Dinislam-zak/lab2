package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class InstallationOfWindows extends WorkingProcessArray {
    long duration = 1;
    @Override
    public void run() {
        while (!arrayWorkingProcess[2] || !arrayWorkingProcess[7]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Start installation of windows");
            try {
                Thread.sleep(1000*duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End installation of windows");
            arrayWorkingProcess[8] = true;
        }
    }
}