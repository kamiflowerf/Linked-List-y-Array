package logic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int t;
		Scanner scan = new Scanner(System.in);
		Object arr[] = {"df", 23, 45, 34, 33, "h", 5, 2};
		
		System.out.println("Arreglo original: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.print("Ingrese el valor de t: ");
		t = scan.nextInt();
		scan.close();
		
		desplazar(arr,arr.length,t);
		System.out.println("Arreglo desplazado: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void desplazar(Object[] arr, int n, int t) {
		
		for (int i = 0; i < t; i++) {
			if(i%2 == 0) {
				Object lastFH = arr[(n/2)-1];
				for(int j = (n/2)-1; j >0 ; j--) {
					arr[j] = arr[j-1];
				}
				arr[0] = lastFH;
			} else {
				Object lastSH = arr[n-1];
				for(int j = n-1; j > n/2; j--) {
					arr[j] = arr[j-1];
				}
				arr[n/2] = lastSH;
			}
		}
	}

}
