package Ej_08_Poo_06_Numeros_Imaginarios;

import java.util.Scanner;

public class AppMainConsole {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    NumeroImaginario numero1,numero2,suma,mult;
    double a,b,c,d;

    int opcion;
    int numero;

    do {
        System.out.println(".:Operaciones con numeros imaginarios:.");
        System.out.println("1- Sumar dos números imaginarios.");
        System.out.println("2- Multiplicar dos números imaginarios.");
        System.out.println("3- Comparar dos números imaginarios (iguales o no).");
        System.out.println("4- Multiplicar un número imaginarios por un entero.");
        System.out.println("5- Salir");

        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                    System.out.println("\nDigite el primer numero imaginario");
                    System.out.print("Digite la parte real: ");
                    a = sc.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = sc.nextDouble();
                    
                    System.out.println("\nDigite el segundo numero imaginario: ");
                    System.out.print("Digite la parte real: ");
                    c = sc.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = sc.nextDouble();

                    numero1 = new NumeroImaginario(a,b);
                    numero2 = new NumeroImaginario(c,d);

                    suma = numero1.getSumarNumeros(numero2);
                    System.out.println("La suma es: "+suma.getNumeroA()+" + "+suma.getNumeroB()+"i\n");
            break;
            case 2:
                System.out.println("\nDigite el primer numero imaginario");
                System.out.print("Digite la parte real: ");
                a = sc.nextDouble();
                System.out.print("Digite la parte imaginaria: ");
                b = sc.nextDouble();
                
                System.out.println("\nDigite el segundo numero imaginario: ");
                System.out.print("Digite la parte real: ");
                c = sc.nextDouble();
                System.out.print("Digite la parte imaginaria: ");
                d = sc.nextDouble();

                numero1 = new NumeroImaginario(a,b);
                numero2 = new NumeroImaginario(c,d);
                mult = numero1.getMultiplicacion(numero2);
                System.out.println("\nLa Multiplicacion es: "+mult.getNumeroA()+" + "+ mult.getNumeroB()+"i\n");
            break;
            case 3:
                System.out.println("\nDigite el primer numero imaginario");
                System.out.print("Digite la parte real: ");
                a = sc.nextDouble();
                System.out.print("Digite la parte imaginaria: ");
                b = sc.nextDouble();
                
                System.out.println("\nDigite el segundo numero imaginario: ");
                System.out.print("Digite la parte real: ");
                c = sc.nextDouble();
                System.out.print("Digite la parte imaginaria: ");
                d = sc.nextDouble();    

                numero1 = new NumeroImaginario(a,b);
                numero2 = new NumeroImaginario(c,d);

                if (numero1.getComprobarIgualdad(numero2)) {
                    System.out.println("Ambos numeros son iguales\n");
                }else{
                    System.out.println("Los numeros imaginarios no son iguales\n");
                }
            break;
            case 4:
                System.out.println("\nDigite el primer numero imaginario");
                System.out.print("Digite la parte real: ");
                a = sc.nextDouble();
                System.out.print("Digite la parte imaginaria: ");
                b = sc.nextDouble();

                numero1 = new NumeroImaginario(a,b);

                System.out.print("Ahora digite el numero entero: ");
                numero = sc.nextInt();
                mult = numero1.getMultiplicarPorEntero(numero);
                
                System.out.println("\nLa Multiplicacion es: "+mult.getNumeroA()+" + "+ mult.getNumeroB()+"i\n");
                break;
                default:
                System.out.println("Ingrese una opcion valida, del 1 al 5");                
                break;
        }        
    } while (opcion != 5);
    sc.close();
}
}