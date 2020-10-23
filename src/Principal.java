import java.util.ArrayList;

public class Principal {
    public static void main(String[] args)  {
        Cesta cesta = new Cesta();
        Cliente cliente = new Cliente(cesta);
        cliente.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (cliente) {
            try {
                System.out.println("Cliente esperando");
                cliente.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("bien");


    }
}
