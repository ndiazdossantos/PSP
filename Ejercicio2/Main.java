public class Main {

    public static void main(String[] args) {
        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        Hilo hilo3 = new Hilo("Hilo 3");
        Hilo hilo4 = new Hilo("Hilo 4");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();


        try{
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();

        }catch (InterruptedException exc){
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }

       /*  do {
         try{
         Thread.sleep(100);
         }catch (InterruptedException exc){
         System.out.println("Hilo principal interrumpido.");
         }
         } while (hilo1.isAlive()|| hilo2.isAlive()|| hilo3.isAlive()||hilo4.isAlive());
         System.out.println("Hilo Principal finalizado.");
*/


    }
