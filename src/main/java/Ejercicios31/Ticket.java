package Ejercicios31;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Ticket {

       	protected List<LineaTicket> productos;
        protected int precioFinal;
        protected int unidadesVendidas;

        public Ticket(){
                this.productos = new ArrayList<>();
        }
        
        protected void agregarLineaTicket(LineaTicket l1){
        	productos.add(l1);
        }

        protected int getUnidadesVendidas(){
              return productos.stream()
              .mapToInt(p -> p.getUnidadesVendidas())
              .sum();
        }

        protected int getPrecioFinal(){
                return productos.stream()
                        .mapToInt(p -> p.getPrecio())
                        .sum();
        }

        private void imprimirTicket() {
                System.out.println(" ********* Impresion ticket ********* ");
                System.out.println("Cantidades vendidas: " + unidadesVendidas);
                System.out.println("precio final: " + precioFinal);
                productos.forEach(producto -> System.out.println(producto.toString()));
        }
        

        public void menu(){
                Scanner leer = new Scanner(System.in);
                System.out.println("********* Bienvenido al Super Mercado ********* ");
                System.out.println(" Ingreso de producto - 1 ");
                System.out.println(" Imprimir ticket - 2 ");
                System.out.println(" Salir - 3 ");

                boolean seguir = true;

                while(seguir){
                        System.out.println("Ingrese opcion: ");
                        int opcion = leer.nextInt();
                        if(opcion == 1){
                                System.out.print("Ingrese nombre producto: ");
                                String nombreProducto = leer.next();
                                System.out.print("Ingrese cantidad de unidades vendidas: ");
                                int cantidades = leer.nextInt();
                                this.unidadesVendidas += cantidades;
                                System.out.print("Ingrese el precio: ");
                                int precio = leer.nextInt();
                                this.precioFinal += precio;
                                LineaTicket l1 = new LineaTicket(nombreProducto, cantidades, precio);
                                productos.add(l1);
                        }
                        else if(opcion == 2){
                                this.imprimirTicket();
                        }
                        else if(opcion == 3){
                                seguir = false;
                        }
                }

        }




}
