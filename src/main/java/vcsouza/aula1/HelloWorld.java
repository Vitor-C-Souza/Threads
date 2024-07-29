package vcsouza.aula1;

public class HelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        var helloworld = new HelloWorld();
        var thread = new Thread(helloworld);

        System.out.println(thread.isAlive());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(thread.isAlive());
    }
}
