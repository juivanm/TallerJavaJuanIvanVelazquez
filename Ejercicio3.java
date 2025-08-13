import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n6=0, n1=0, nInferior=0;
        double notas=1, suma6=0, suma1=0, sumaMenor=0, promedio6=0, promedioInferior=0, promedio1=0;
        System.out.println("------- Ingresa las notas en escala del 1 al 10 --------");

        for(int i=1; i<=20; i++){
            System.out.println("Ingresa la nota n°: "+i);
            notas = sc.nextDouble();
            if (notas<1 || notas>10 || notas == 0) {
                System.out.println("Error nota menor a 1 o mayor a 10");
                sc.close();
                return;
            } else {
                if (notas>=6 && notas<=10) {
                    suma6 += notas;
                    n6++;
                }
                if (notas<6 && notas >1) {
                    sumaMenor += notas;
                    nInferior++;
                }
                if (notas == 1) {
                    suma1 += notas;
                    n1++;
                }
            } 
        }
        
        if (n6>0) {
            promedio6 = suma6/n6;
        }
        if (nInferior>0) {
            promedioInferior = sumaMenor/nInferior;
        }
        if (n1>0) {
            promedio1 = suma1/n1;
        }

        int sumaContadores = n6+nInferior+n1;
        if (sumaContadores == 20) { //Verifico que las notas sean = a 20 para asegurar que se ingresaron todas
            double sumaTotal = suma6+suma1+sumaMenor;
            double promTotal = sumaTotal/sumaContadores;

            System.out.println("Notas Totales: "+sumaContadores);
            System.out.println("Promedio notas mayores o iguales a 6: "+promedio6);
            System.out.println("Promedio notas inferiores a 6: "+promedioInferior);
            System.out.println("Cantidad de notas iguales a 1: "+n1);
            System.out.println("El promedio total es : "+promTotal);
        } else {
            System.out.println("Hubo un error en el conteo");
        }
        sc.close();
        
    }
}
