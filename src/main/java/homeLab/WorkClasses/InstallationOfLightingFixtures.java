package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class InstallationOfLightingFixtures extends WorkingProcessArray {
    int duration = 1;
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
        System.out.println("Start installation of lightning fixtures");
        dayOfBegin = getDays();
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End installation of lightning fixtures");
        dayOfEnd = getDays();
        arrayWorkingProcess[14] = true;
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