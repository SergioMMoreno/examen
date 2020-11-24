package examen;

public class Producto implements Comparable<Producto>{
    private String nombre;
    private int precio;
    private String unidadDeMedida;
    private String cantidad;

    
    public Producto(String nombre, int precio, String unidadDeMedida, String cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.unidadDeMedida = unidadDeMedida;
        this.cantidad = cantidad;
    } 

    public String getNombre(){
        return nombre;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public String getUnidadDeMedida(){
        return unidadDeMedida;
    }
    
    public String getCantidad(){
        return cantidad;
    }
    
    
    @Override
    public int compareTo(Producto producto) {
        return this.cantidad.compareTo(producto.getCantidad());
    }
    
    @Override
    public String toString(){
        
        String mostrar = null;
        switch(nombre){
            case "Coca-Cola Zero":
                mostrar = "Nombre: " + nombre + " /// "  + "Litros: " + unidadDeMedida + " /// " + "Precio: " + "$" + precio;
            break;
            case "Coca-Cola":
                mostrar = "Nombre: " + nombre + " /// "  + "Litros: " + unidadDeMedida + " /// " + "Precio: " + "$" + precio;
            break;
            case "Shampoo Sedal":
                mostrar = "Nombre: " + nombre + " /// "  + "Contenido: " + unidadDeMedida + " /// " + "Precio: " + "$" + precio;
            break;
            case "Frutilla":
                mostrar = "Nombre: " + nombre + " /// "  + "Precio: " + "$" + precio + " /// " + "Unidad de Venta: " + cantidad;
            break;
        }
        return mostrar;
    }
    
}
