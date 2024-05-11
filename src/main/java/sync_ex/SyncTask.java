package sync_ex;


public class SyncTask implements Runnable {

    private String message;
    private IPrinterUtil printerUtil;

    public SyncTask(IPrinterUtil printerUtil, String message) {
        this.message = message;
        this.printerUtil = printerUtil;
    }

    @Override
    public void run() {
        //printerUtil.print(message);
        printerUtil.printSyncBlock(message);
    }
}
