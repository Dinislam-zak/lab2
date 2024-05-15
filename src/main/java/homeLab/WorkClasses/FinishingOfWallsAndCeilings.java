package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class FinishingOfWallsAndCeilings extends WorkingProcessArray {
    int duration = 7;
    int dayOfBegin;
    int dayOfEnd;
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
        dayOfBegin = getDays();
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End finishing of walls and ceilings");
        dayOfEnd = getDays();
        arrayWorkingProcess[12] = true;
    }
    @Override
    protected int getDuration() {
        return duration;
    }

    @Override
    protected int getDayOfBegin() {
        return dayOfBegin;
    }

    @Override
    protected int getDayOfEnd() {
        return dayOfEnd;
    }
}