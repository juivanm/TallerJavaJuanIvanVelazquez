import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creo objeto Scanner
        int n6=0, n1=0, nInferior=0; //Contadores por categoria
        double notas=1, suma6=0, suma1=0, sumaMenor=0, promedio6=0, promedioInferior=0, promedio1=0; //Declaro variables para guardar las sumas de las notas
        System.out.println("------- Ingresa las notas en escala del 1 al 10 --------");

        for(int i=1; i<=20; i++){ //Ciclo que recorre las 20 notas
            System.out.println("Ingresa la nota n°: "+i); //Solicito la primer nota mostrando con i
            notas = sc.nextDouble();
            if (notas<1 || notas>10 || notas == 0) {//Verifico que la nota no sea menor a uno y no sea mayor a 10 y no sea 0
                System.out.println("Error nota menor a 1 o mayor a 10"); //Error si la nota entra al if
                sc.close(); //Cierro scanner
                return; //Uso return para detener la ejecución del programa
            } else { //Si la nota entra en el rango ya realizó las operaciones
                if (notas>=6 && notas<=10) { //Verifico que la nota sea mayro o igual a 6 y menor o igual a 10 para siempre estar en el rango de 6 a 10 aunque el for ya lo hace pero es una validación extra
                    suma6 += notas; //Sumo las notas mayores a o iguales a 6
                    n6++; //Aumento contador
                }
                if (notas<6 && notas >1) { //Verifico que las notas sean menores a 6 y mayores a 1 para excluir el 1 y contarlo después
                    sumaMenor += notas; //Sumo las notas
                    nInferior++; //Incremento contador
                }
                if (notas == 1) { //Si las notas son iguales a 1
                    suma1 += notas; //Sumo las notas
                    n1++; //Incremento contador
                }
            } 
        }
        
        if (n6>0) { //Verifico que el contador sea mayor a 0 para poder sacar el promedio y evitar un error de dividir entre 0
            promedio6 = suma6/n6;
        }
        if (nInferior>0) { //Verifico que el contador sea mayor a 0 para poder sacar el promedio y evitar un error de dividir entre 0
            promedioInferior = sumaMenor/nInferior;
        }
        if (n1>0) { //Verifico que el contador sea mayor a 0 para poder sacar el promedio y evitar un error de dividir entre 0
            promedio1 = suma1/n1;
        }

        int sumaContadores = n6+nInferior+n1; //Sumo los contadores, esto debe dar 20 para asegurar que todas las notas fueron ingresadas
        if (sumaContadores == 20) { //Verifico que las notas sean = a 20 para asegurar que se ingresaron todas
            double sumaTotal = suma6+suma1+sumaMenor; //Sumo todas las sumas de las notas
            double promTotal = sumaTotal/sumaContadores; //Saco el promedio total

            System.out.println("Notas Totales: "+sumaContadores);
            System.out.println("Promedio notas mayores o iguales a 6: "+promedio6);
            System.out.println("Promedio notas inferiores a 6: "+promedioInferior);
            System.out.println("Cantidad de notas iguales a 1: "+n1);
            System.out.println("El promedio total es : "+promTotal);
        } else {
            System.out.println("Hubo un error en el conteo"); //Si hubo un error y no fueron 20 notas
        }
        sc.close(); //Cierro el scanner
        
    }
}

