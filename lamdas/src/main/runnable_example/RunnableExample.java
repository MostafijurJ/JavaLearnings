package main.runnable_example;

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread =  new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("printed inside runnable method!");
            }
        });
        thread.start();

        Thread lambdaThread = new Thread(()-> System.out.println("thread is running through lambda"));
        lambdaThread.start();

    }
}
