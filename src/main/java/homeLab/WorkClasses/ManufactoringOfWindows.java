package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class ManufactoringOfWindows extends WorkingProcessArray {
    long duration = 7;
    @Override
    public void run() {
        while (!arrayWorkingProcess[1]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Start manufactoring of windows");
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End manufactoring of windows");
        arrayWorkingProcess[2] = true;
    }
}