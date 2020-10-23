import java.util.ArrayList;

public class Cesta {
    private ArrayList <Integer> productos = new ArrayList<>();

    public Cesta (ArrayList <Integer> productos) {
        this.productos = productos;
    }


    public Cesta() {

    }

    public void addProduct (int aux) {
        this.productos.add(aux);
    }
}
