package ejercicio;

import java.util.Scanner;

public class auxiliar12 {
 public static void main(String[] args) {
    int a;
    int b = 0;
    int c = 1;
    int p = 0;
    int n ;
    do {
        a = new Scanner(System.in).nextInt();
        n = new Scanner(System.in).nextInt();
    } while (a <0 || n<0);
    for (int i = 0; i < n; i++) {
        b = a % 10;
        b = b/10;
        a = a % 10;
    }
    if (a > 0) {
        p = (b*10)+a;
        System.out.println(p);
     }
 }
}
