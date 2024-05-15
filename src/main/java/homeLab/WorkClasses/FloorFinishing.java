package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class FloorFinishing extends WorkingProcessArray {
    int duration = 7;
    int dayOfBegin;
    int dayOfEnd;

    @Override
    public void run() {
        while (!arrayWorkingProcess[12]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Start floor finishing");
        dayOfBegin = getDays();
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End floor finishing");
        dayOfEnd = getDays();
        arrayWorkingProcess[13] = true;
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