package ProyectoMenu;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        float suma = 0F; //Declaro suma aquí porque la uso en varios case
        do {
            System.out.println("\n****** MENÚ ********");
            System.out.println("\n 1. Registrar \n 2. Mostrar total de ventas\n 3. Salir");
            System.out.println("\nIngresa la opción");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> 
                        {
                            //variables especificas de case 1
                            float precio = 0F;
                            int otroPedido = 0;
                            //Uso de otro do while para mantener menú abierto cuando sea negaativo y el usuario quiera agregar mas pedidos
                            do {
                                System.out.println("\n**** Registrando pedido ****");
                                System.out.println("\nIngresa el precio del pedido");
                                precio = sc.nextFloat(); //Uso float porque el precio puede ser con punto decimal
                                if (precio < 0) { //Valido que no sea negativo
                                    System.out.println("----- El precio no puede ser negativo -----");
                                    otroPedido = 1; //Cambio el valor para repetir el ciclo si es negativo
                                } else {
                                    suma += precio; //Sumo si no es negativo
                                    System.out.println("\n¿Quieres agregar otro pedido?: (1: Si, 2: No)");
                                    otroPedido = sc.nextInt(); //Guardo la opción del usuario
                                }
                            } while (otroPedido == 1);
                        }
                case 2 -> 
                        {
                            System.out.println("\n**** Mostrar total de ventas ****");
                            System.out.println("\n---- Total de ventas : "+suma);
                        }
                case 3 -> System.out.println("Terminando...");
                default -> System.out.println("Error ingresa una opción del menú");
            }
            
        } while (opcion != 3);
        sc.close();
    }
}
