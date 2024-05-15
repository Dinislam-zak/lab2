package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class Project extends WorkingProcessArray {
    int duration = 7;
    int dayOfBegin;
    int dayOfEnd;
    @Override
    public void run() {
        startCount();
        while (!arrayWorkingProcess[0]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Start Project");
        dayOfBegin = getDays();
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Project");
        dayOfEnd = getDays();
        arrayWorkingProcess[1] = true;
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