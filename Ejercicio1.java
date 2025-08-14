import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Objeto Scanner para leer entrada del usuario
        int numero1 = 0, numero2 = 0, resultado = 0; //Variables para entradas y resultado

        System.out.println("Ingresa el numero 1 ");
        numero1 = sc.nextInt();
        System.out.println("Ingresa el numero 2 ");
        numero2 = sc.nextInt();
        sc.close(); //Cierre de Scanner ya que no se requiere más entrada

        // Convertimos números negativos a positivos usando operador ternario
        int num1 = numero1 < 0 ? -numero1 : numero1; //declaro variable y asigno usando un if terniario donde al usar -numero1 convierto el numero negativo a positivo ya que usar -numero1 es como multiplicar por -1
        int num2 = numero2 < 0 ? -numero2 : numero2; 

        // Simulo la multiplicación como suma repetida
        for(int i = 0; i < num2; i++){ //declaro i=0 e i < num2 porque el num2 es las veces que num1 se va sumar para replicar la multiplicación
            resultado += num1; //resultado guarda y suma lo que tiene num1 para que se vaya sumando (mutiplicando) ejempl: num1=10, num2=2 : itercion1 : result += 10, iteracion2 : result += 20, result=20
        }
        System.out.println("Resultado: "+resultado); //result = 20
    }
}

