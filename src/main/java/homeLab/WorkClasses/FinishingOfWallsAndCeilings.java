package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class FinishingOfWallsAndCeilings extends WorkingProcessArray {
    long duration = 7;
    @Override
    public void run() {
        while (!arrayWorkingProcess[8] || !arrayWorkingProcess[9] || !arrayWorkingProcess[11]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Start finishing of walls and ceilings");
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End finishing of walls and ceilings");
        arrayWorkingProcess[12] = true;
    }
}