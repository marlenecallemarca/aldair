package ejercicio;

import java.util.Scanner;

public class auxiliar {
 public static void main(String[] args) {
    int n;
    int p =0 ;
    int c=0;
    do {
        System.out.println("introdusca numero entero positivo");
        n = new Scanner(System.in).nextInt();
        System.out.println("introdusca valor de los productos");
        p = new Scanner(System.in).nextInt();
    } while (p <0 || n <0);
        while ( c < 1 ) {
        if (p >= 200) {
            double m = p-(p*0.15);
            System.out.println("los productos adquiridos son: "+n+"  el total es: "+p +"     el monto con el descuento de el 15% es de: "+m);
            System.out.println("el monto a pagar de los productos con el descuento de el 15% es de: "+m);
        }else{
            if (p > 100) {
                double m = p-(p*0.12);
                System.out.println("los productos adquiridos son: "+n+"  el total es: "+p +"    el monto con el descuento de el 12% es de: "+m);
                System.out.println("el monto a pagar de los productos con el descuento de el 12% es de: "+m);
            }else{
                double m = p-(p*0.10);
                System.out.println("los productos adquiridos son: "+n+"  el total es: "+p +"    el monto con el descuento de el 10% es de: "+m);
                System.out.println("el monto a pagar de los productos con el descuento de el 10% es de: "+m);
            }
        }
        
        c++;
        
    }

 }
    }
 

