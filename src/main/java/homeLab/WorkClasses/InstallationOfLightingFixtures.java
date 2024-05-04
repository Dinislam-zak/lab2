package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class InstallationOfLightingFixtures extends WorkingProcessArray {
    long duration = 1;
    @Override
    public void run() {
        while (!arrayWorkingProcess[12]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Start installation of lightning fixtures");
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End installation of lightning fixtures");
        arrayWorkingProcess[14] = true;
    }
}