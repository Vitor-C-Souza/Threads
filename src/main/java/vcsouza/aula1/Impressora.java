package vcsouza.aula1;

public class Impressora implements Runnable {
    private int id;
    public Impressora(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Impressora " + id + "	valor:	" + i);
        }
    }

    public static void main(String[] args) {

        var impressora1 = new Impressora(1);
        var impressora2 = new Impressora(2);

        var Thread1 = new Thread(impressora1);
        var Thread2 = new Thread(impressora2);

        // ex 1
//        Thread1.start();
//        Thread2.start();

//        ex 2

//        Thread1.setPriority(1);
//        Thread2.setPriority(10);
//
//        Thread1.start();
//        Thread2.start();

//        ex 3
        Thread1.setPriority(10);
        Thread2.setPriority(1);

        Thread1.start();
        Thread2.start();



    }
}
