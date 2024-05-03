package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class InstallationOfPlumbing extends WorkingProcessArray {
    long duration = 2;
    @Override
    public void run() {
        while (!arrayWorkingProcess[5] || !arrayWorkingProcess[11] || !arrayWorkingProcess[12]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Start installation of plumbing");
            try {
                Thread.sleep(1000*duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End installation of plumbing");
            arrayWorkingProcess[15] = true;
        }
    }
}