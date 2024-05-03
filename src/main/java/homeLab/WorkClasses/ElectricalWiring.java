package homeLab.WorkClasses;

import homeLab.WorkingProcessArray;

public class ElectricalWiring extends WorkingProcessArray {
    long duration = 3;
    @Override
    public void run() {
        while (!arrayWorkingProcess[5] || !arrayWorkingProcess[7]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Start electrical wiring");
            try {
                Thread.sleep(1000*duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End electrical wiring");
            arrayWorkingProcess[11] = true;
        }
    }
}