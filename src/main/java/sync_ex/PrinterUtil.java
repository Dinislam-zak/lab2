package sync_ex;

public class PrinterUtil implements IPrinterUtil {

    public synchronized void print(String message) {

        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < message.length(); ++i)
            System.out.print(message.charAt(i));

        System.out.println();
    }

    public void printSyncBlock(String message) {

        System.out.println(Thread.currentThread().getName() + "in method");

        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " in block");
            for (int i = 0; i < message.length(); ++i)
                System.out.print(message.charAt(i));

            System.out.println();
        }
    }
}
