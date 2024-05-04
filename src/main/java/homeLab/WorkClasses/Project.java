package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class Project extends WorkingProcessArray {
    long duration = 7;
    @Override
    public void run() {
        while (!arrayWorkingProcess[0]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Start Project");
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Project");
        arrayWorkingProcess[1] = true;
    }
}