package Ejercicios31;

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
		StringBuilder builder = new StringBuilder();
		builder.append("Linea [Nombre Producto= ");
		builder.append(nombreProducto);
		builder.append(", Unidades Vendidas= ");
		builder.append(unidadesVendidas);
		builder.append(",Precio= ");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}


    /**
     * @return
     */
    /*@Override
    public String toString() {
        return "LineaTicket{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", unidadesVendidas=" + unidadesVendidas +
                ", precio=" + precio +
                '}';
    }*/
}
