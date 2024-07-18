package ejercicio;

import java.util.Scanner;

public class dass {
    public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		System.out.print("Introdusca un numero: ");
		int N = lee.nextInt();
		int a,b,p,c;
		a=0;
		b=1;
		p=2;
		
		for(int i=1;i<=N;i++) {
			if(i%2==0) {
				int sw=0;
				while(sw==0){
					int cd=0;
					c=2;
					while(c<=Math.sqrt(p)) {
						if(p%c==0)
							cd++;
					c++;
					}
					if(cd==0) {
						System.out.print(p+", ");
						sw=1;
					}
					p++;
				}
			}else {
				System.out.print(a+", ");
				c=a+b;
				a=b;
				b=c;
			}
		}
	}
}
