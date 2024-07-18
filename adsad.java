package ejercicio;

import java.util.Scanner;

public class adsad {
 public static void main(String[] args) {
    int num = 6789;
    int b = 1;
    int a ;
    do {
        a = new Scanner(System.in).nextInt();
        
            if (num == a) {
                b = 1;
            }else{
                b++;
            }
    } while (b <= 3);
    if (b == 1) {
        System.out.println("correcto");
    }else{
        System.out.println("incorrecto");
    }
    
 }
}

