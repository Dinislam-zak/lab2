package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class InstallationOfHeatingDevices extends WorkingProcessArray {
    int duration = 3;
    int dayOfBegin;
    int dayOfEnd;
    @Override
    public void run() {
        while (!arrayWorkingProcess[5] || !arrayWorkingProcess[8] || !arrayWorkingProcess[9]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Start installation of heating devices");
        dayOfBegin = getDays();
        try {
            Thread.sleep(1000*duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End installation of heating devices");
        dayOfEnd = getDays();
        arrayWorkingProcess[10] = true;
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