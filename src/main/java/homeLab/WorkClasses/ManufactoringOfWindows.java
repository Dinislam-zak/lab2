package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class ManufactoringOfWindows extends WorkingProcessArray {
    int duration = 7;
    int dayOfBegin;
    int dayOfEnd;
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
        dayOfBegin = getDays();
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End manufactoring of windows");
        dayOfEnd = getDays();
        arrayWorkingProcess[2] = true;
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