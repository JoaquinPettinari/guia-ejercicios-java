package Ejercicios3;

public class LineaTicket {
    String nombreProducto = "";
    int unidadesVendidas = 0;
    int precio = 0;

    public LineaTicket(String nombreProducto, int unidadesVendidas, int precio){
        this.nombreProducto = nombreProducto;
        this.unidadesVendidas = unidadesVendidas;
        this.precio = precio;
    }

    protected int getPrecio(){
        return precio;
    }

    protected String getNombreProducto(){
        return nombreProducto;
    }

    protected int getUnidadesVendidas(){
        return unidadesVendidas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Nombre Producto: ");
        sb.append(nombreProducto);
        sb.append("\n Unidades Vendidas: ");
        sb.append(unidadesVendidas);
        sb.append("\n Precio: ");
        sb.append(precio);
        return sb.toString();

    }
}
