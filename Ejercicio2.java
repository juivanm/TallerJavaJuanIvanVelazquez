import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creo objeto Scanner para la entrada
        int numero=0, numNumeros=0; //Creo variables de entrada
        int minimo=Integer.MAX_VALUE; //Inicializo con el valor máximo posible para encontrar el mínimo
        System.out.println("Ingresa cuantos numeros meteras"); //Solicito los numeros
        numNumeros = sc.nextInt(); //Leo numero
        if (numNumeros>=10) { // Valido que se ingresen al menos 10 números
            for(int i=1; i<=numNumeros; i++){ //Recorro hasta llegar al numero ingresado
                System.out.println("Ingresa el numero : "+i+""); //Solicito los numeros uno a uno
                numero = sc.nextInt(); //Gurado uno por uno los numeros
                // Actualizo el mínimo si el número actual es menor
                if (numero<minimo) { //Compara si el número ingresado es menor a minimo que en la primer iteración es muy grande entonces entra y minimo se actualiza
                    minimo = numero;
                }
            }
            System.out.println("El numero menor es: "+minimo); //Imprimo cual es el numero menor
            if (minimo<10)  //Si el numero menor es menor a 10 imprimo "Es menor a 10"
                System.out.println("El numero "+minimo+" es menor a 10");
            else //Si no es menor a 10 seiginifca que es mayor entonces imprimo "es mayor o igual a 10"
                System.out.println("El numero "+ minimo+" es mayor o igual que 10: "+minimo);
        } else { //Si no ingresa minimo 10 numeros sale este mensaje de control
            System.out.println("Debes ingresar minimo 10 numeros");
        }
    }
    sc.close(); //Cierro el scanner
}
