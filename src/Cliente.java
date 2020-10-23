import java.util.ArrayList;

public class Cliente extends Thread {
    private int cantidad;
    private int max;
    private Cesta cesta;

    public Cliente (Cesta cesta) {
        this.cantidad = 0;
        this.max = 4;
        this.cesta = cesta;
    }



    public void llenarCesta() {
        for (int i = 0; i < this.max; i++) {
            this.cesta.addProduct(i);
            System.out.println("Productos " + i);

        }
    }

    public void run() {
        llenarCesta();
        synchronized (this.cesta) {
            this.cesta.notify();
            System.out.println("Notifico");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Cesta getCesta() {
        return cesta;
    }

    public void setCesta(Cesta cesta) {
        this.cesta = cesta;
    }
}
