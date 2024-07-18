package ejercicio;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n %2==0) {
            n--;
        }
        for (int i = n; i >0; i=i-2) {
            System.out.println(i);
        }
    }
}
