package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class RoofConstruction extends WorkingProcessArray {
    int duration = 3;
    int dayOfBegin;
    int dayOfEnd;
    @Override
    public void run() {
        while (!arrayWorkingProcess[6]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Start Laying Communications");
        dayOfBegin = getDays();
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Laying Communications");
        dayOfEnd = getDays();
        arrayWorkingProcess[7] = true;
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