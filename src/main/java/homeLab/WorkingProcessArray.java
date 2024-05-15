package homeLab;

public abstract class WorkingProcessArray implements Runnable {
    protected static boolean [] arrayWorkingProcess = new boolean[16];
    protected static int days;
    protected static boolean isCounting;
    protected void startCount() {
        isCounting = true;
        Thread countingThread = new Thread(() -> {
            while (isCounting) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                days++;
            }
        });
        countingThread.start();
    }


    protected void stopCount() {
        isCounting = false;
    }

    protected int getDays() {
        return days;
    }
    abstract protected int getDuration();
    abstract protected int getDayOfBegin();
    abstract protected int getDayOfEnd();
}
