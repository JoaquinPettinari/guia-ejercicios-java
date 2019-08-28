package Ejercicios3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Ticket {

        protected List<LineaTicket> productos;
        int precioFinal;
        int unidadesVendidas;

        public Ticket(){
                this.productos = new ArrayList<>();
        }
        private int getUnidadesVendidas(){
              return productos.stream()
              .mapToInt(p -> p.getUnidadesVendidas())
              .sum();
        }

        private int getPrecioFinal(){
                return productos.stream()
                        .mapToInt(p -> p.getPrecio())
                        .sum();
        }

        private void imprimirTicket() {
                System.out.println(" ********* Impresion ticket ********* ");
                System.out.println("Cantidades vendidas: " + unidadesVendidas);
                System.out.println("precio final: " + precioFinal);
                productos.forEach(producto -> producto.toString());
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
                                System.out.print("Ingrese nombre producto");
                                String nombreProducto = leer.next();
                                System.out.println("Ingrese cantidad de unidades vendidas");
                                int cantidades = leer.nextInt();
                                System.out.println("Ingrese el precio: ");
                                int precio = leer.nextInt();
                                LineaTicket l1 = new LineaTicket(nombreProducto, cantidades, precio);
                        }
                        else if(opcion == 2){
                                System.out.println(imprimirTicket());
                        }
                        else if(opcion == 3){
                                seguir = false;
                        }
                }

        }




}
