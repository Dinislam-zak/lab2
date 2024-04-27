package labParallelStream;

public class Task implements Runnable{
    private String data;

    public Task (String data){
        this.data = data;
    }
    @Override
    public void run() {
        for (int i = 0; i < data.length(); i++){
            System.out.print(data.charAt(i));
        }
    }
}
