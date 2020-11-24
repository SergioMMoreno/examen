package examen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Collections.sort(cargarDatos());

        // Despliega en consola usando el metodo toString()
        for (Producto p : cargarDatos()) {
            System.out.println(p.toString());
        }
        System.out.println("=============================");

        buscarMayor();
        buscarMenor();
        cargarDatos();
    }

    private static void buscarMayor() {
        int mayor = 0;
        String nombreDelMayor = "";
        for (int i = 0; i < cargarDatos().size(); i++) {
            if (cargarDatos().get(i).getPrecio() > mayor) {
                mayor = cargarDatos().get(i).getPrecio();
            }
            nombreDelMayor = cargarDatos().get(i).getNombre();
        }
        System.out.println("Producto más caro: " + nombreDelMayor);
    }

    private static void buscarMenor() {
        int menor = 999999;
        String nombreDelMenor = "";
        for (int j = 0; j < cargarDatos().size(); j++) {
            if (cargarDatos().get(j).getPrecio() < menor) {
                menor = cargarDatos().get(j).getPrecio();
                nombreDelMenor = cargarDatos().get(j).getNombre();
            }
        }
        System.out.println("Producto más barato: " + nombreDelMenor);
    }

    private static List<Producto> cargarDatos() {
        List<Producto> lista = new ArrayList<Producto>();
        lista.add(new Producto("Coca-Cola Zero", 20, "1.5", ""));
        lista.add(new Producto("Coca-Cola", 18, "1.5", ""));
        lista.add(new Producto("Shampoo Sedal", 19, "500ml", ""));
        lista.add(new Producto("Frutilla", 64, "", "kilos"));
        return lista;
    }

}
