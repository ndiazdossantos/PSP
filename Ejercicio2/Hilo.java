public class Hilo extends Thread{
    public Hilo (String str){
        super (str);
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            int numero = (int)(Math.random()*10+1);
            System.out.println("Numero " + numero + " : " + getName());
            try {
                sleep(500);
            } catch (InterruptedException e) {}
        }
        System.out.println("Final del hilo! " + getName());
    }

}
