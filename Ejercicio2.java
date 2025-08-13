import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0, numNumeros=0;
        int minimo=Integer.MAX_VALUE;
        System.out.println("Ingresa cuantos numeros meteras");
        numNumeros = sc.nextInt();
        if (numNumeros>=10) {
            for(int i=1; i<=numNumeros; i++){
                System.out.println("Ingresa el numero : "+i+"");
                numero = sc.nextInt();
                if (numero<minimo) {
                    minimo = numero;
                }
            }
            System.out.println("El numero menor es: "+minimo);
            if (minimo<10) 
                System.out.println("El numero "+minimo+" es menor a 10");
            else
                System.out.println("El numero "+ minimo+" es menor es mayor o igual que 10: "+minimo);
        } else {
            System.out.println("Debes ingresar minimo 10 numeros");
        }
    }
}