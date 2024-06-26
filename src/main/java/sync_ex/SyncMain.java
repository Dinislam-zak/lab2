package sync_ex;

public class SyncMain {
    public static void main(String[] args) {
        IPrinterUtil printerUtil = new PrinterUtil();

        new Thread(new SyncTask(printerUtil, "Учтите, что следуя этим правилам, мы в результате придём к тем же двум байтам, которые получили бы, упаковав биты MSB в большой integer и сохранив его в порядке big-endian. Если бы мы вместо этого решили разбить «c» таким образом, чтобы его LSB был в первом байте, а четыре его бита более высшего порядка — во втором байте, то это бы не сработало. Я буду называть такие непротиворечивые правила упаковки битов «естественными» правилами."),"Поток 1")
                .start();
        new Thread(new SyncTask(printerUtil, "Разумеется, у упаковки битов LSB-first существует собственное естественное правило. Оно заключается во вставке нового значения бит за битом, начиная с LSB и вверх, и если мы так сделаем, то в результате получим следующий битовый поток:"),"Поток 2")
                .start();
        new Thread(new SyncTask(printerUtil,"Естественная упаковка LSB-first даёт нам те же байты, что и упаковка LSB-first в большой integer с сохранением его в порядке байтов little-endian. Кроме того, у нас на рисунке возникает очевидная неуклюжесть: логически сопряжённая упаковка поля «c» в несколько байтов выглядит на таком рисунке прерывистой, в то время как рисунок упаковки MSB-first выглядит так, как мы того и ожидаем. Но и в нём возникает проблема: в рисунке MSB-first мы нумеруем биты в увеличивающемся справа налево порядке (стандартном), а байты — в увеличивающемся слева направо порядке (что тоже является стандартным)."),"Поток 3")
                .start();
        System.out.println("Ожидаем завершения работы потоков");
    }
}
