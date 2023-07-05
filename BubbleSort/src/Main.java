import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// siralama algoritmalari
		// bubble sort
		// en buyuk degeri bulup en sona tasiyoruz.
		
		// 7 5 1 3 2
		Scanner scan = new Scanner(System.in);
		int size;
		
		System.out.println("Dizi boyutu: "); 
		size = scan.nextInt();
		
		int [] dizi = new int[size];
		
		
		for(int i = 0; i < size ; i++)
		{
			
			System.out.println("Dizinin " +i+ ". elemanini giriniz.");
			dizi[i] = scan.nextInt();
		}

		bubbleSort(dizi , size);
		
		System.out.print("Bubble sort ile siralama yapildi: ");
		
		for(int i = 0;i<size;i++)
		{
			System.out.print(dizi[i] + " ");
		}
		 
		
		
		
		
	}

	private static void bubbleSort(int[] dizi, int size) {
		
		
		
		for (int i = 0;i<size-1;i++)
		 {
			 for (int j = 0;j < size-i-1; j++)
			 {
				 if(dizi[j] > dizi[j+1])
				 {
					 int temp ;
					 
					 temp = dizi[j];
					 dizi[j] = dizi[j+1];
					 dizi[j+1] = temp;
					 
				 }
			 }
		 }
		
	}

}
