import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0, numero2 = 0, resultado = 0;

        System.out.println("Ingresa el numero 1 ");
        numero1 = sc.nextInt();
        System.out.println("Ingresa el numero 2 ");
        numero2 = sc.nextInt();
        sc.close();

        int num1 = numero1 < 0 ? -numero1 : numero1;
        int num2 = numero2 < 0 ? -numero2 : numero2;

        for(int i = 0; i < num2; i++){
            resultado += num1;
        }
        System.out.println("Resultado: "+resultado);
    }
}
