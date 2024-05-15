package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class InstallationOfPlumbing extends WorkingProcessArray {
    int duration = 2;
    int dayOfBegin;
    int dayOfEnd;
    @Override
    public void run() {
        while (!arrayWorkingProcess[5] || !arrayWorkingProcess[11] || !arrayWorkingProcess[12]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Start installation of plumbing");
        dayOfBegin = getDays();
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End installation of plumbing");
        dayOfEnd = getDays();
        arrayWorkingProcess[15] = true;
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