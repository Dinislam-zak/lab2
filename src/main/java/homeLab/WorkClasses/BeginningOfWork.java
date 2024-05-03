package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class BeginningOfWork extends WorkingProcessArray {
    @Override
    public void run() {
        System.out.println("Start Beginning of work");
        System.out.println("End Beginning of work");
        arrayWorkingProcess[0] = true;
        startCount();
    }
}
