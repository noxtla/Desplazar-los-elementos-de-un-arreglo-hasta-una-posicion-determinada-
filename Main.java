package arreglo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int arregloA [] = new int [10];
		int pos,valor;

		arregloA[0] = 0;
		arregloA[1] = 1;
		arregloA[2] = 2;
		arregloA[3] = 3;
		arregloA[4] = 4;
		arregloA[5] = 5;
		arregloA[6] = 6;
		
		/*for(int i=0; i<5; i++) {
			System.out.print("Ingresa el numero para la A  " + (i+1));
			arregloA[i] = entrada.nextInt();
		}*/
		
		System.out.println("Ingresa la pos");
		pos = entrada.nextInt();
		System.out.println("Ingresa el valor");
		valor = entrada.nextInt();
		
		///Correr una posicion los elementos detras del la pos que el usuario quiere
		for (int i = 5; i<=pos;i--) { /// 1-2-3-numero-4-5-6
			arregloA[i+1] = arregloA [i];
		}
		
		arregloA[pos] = valor;
		
		for (int i=0; i<10; i++) {
			System.out.println( "Arreglo " + arregloA[i]);
		}
	}
	
}
