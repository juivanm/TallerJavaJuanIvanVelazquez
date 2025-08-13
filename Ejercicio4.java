import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("-- Opciones 1: Actualizar, 2: Eliminar, 3: Crear, 4: Listar, 5: Salir --");
            System.out.println("Ingresa la opción");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Usuario actualizado correctamente");
                    break;
                case 2:
                    System.out.println("Usuario eliminado correctamente");
                    break;
                case 3:
                    System.out.println("Usuario creado correctamente");
                    break;
                case 4:
                    System.out.println("Usuario listado correctamente");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error eligue entre las opciones disponibles");
                    break;
            }
        } while (opcion != 5);
        sc.close();
        System.out.println("Haz salido con exito!");
    }
}
