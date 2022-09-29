
/*realizar operaciones matematicas: suma, resta, operacion, división*/

package test;

import comunes.Operaciones;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Aritmetica {
    
    static Operaciones operacion = new Operaciones();
    static int n1;
    static int n2;
    static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("OPERACIONES ARITMETICAS");
        System.out.println("=======================");
        menu();
    }
    public static void menu(){
        int opcion=-1;
        while(opcion!=0){
        System.out.println("MENU\n");
        System.out.println("(1) SUMA ");
        System.out.println("(2) RESTA ");
        System.out.println("(3) MULTIPLICACIÓN ");
        System.out.println("(4) DIVISIÓN ");
        System.out.println("\t\t\t\t\t\t\t(0) [SALIR]");
        System.out.print("Seleccione la opcion a elegir: ");
        opcion=ent.nextInt();
        switch(opcion){
            case 1:
                System.out.print("Introduzca el primer número por teclado:  ");
                n1 = ent.nextInt();
                System.out.print("Introduzca el segundo número por teclado:  ");
                n2 = ent.nextInt();
                operacion.suma(n1, n2);
                break;
            case 2:
               System.out.print("Introduzca el primer número por teclado:  ");
                n1 = ent.nextInt();
                System.out.print("Introduzca el segundo número por teclado:  ");
                n2 = ent.nextInt();
                operacion.resta(n1, n2);
                break;
            case 3:
                System.out.print("Introduzca el primer número por teclado:  ");
                n1 = ent.nextInt();
                System.out.print("Introduzca el segundo número por teclado:  ");
                n2 = ent.nextInt();
                operacion.multiplicacion(n1, n2);
                break;
            case 4:
                System.out.print("Introduzca el primer número por teclado:  ");
                n1 = ent.nextInt();
                System.out.print("Introduzca el segundo número por teclado:  ");
                n2 = ent.nextInt();
                operacion.division(n1, n2);
                break;                                                                                                                                                                          
            case 0:
                break;
            default:
                System.out.println("Elija entre las opcines 1 y 4");
                break;
        }
        for(int i=0;i<2;i++){
            System.out.println("");
        }
        }
    }
}
