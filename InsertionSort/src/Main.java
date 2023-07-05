import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kac adet sayi girmek istersiniz: "); 
		int n = scan.nextInt();
		int [] dizi = new int [n];
	 	
		for(int i = 0;i<n;i++)
		{
			System.out.print("sayi: "); dizi[i] = scan.nextInt();
		}
	
	
		insertionSort(dizi, n);
		
		System.out.println();
		System.out.print("Siralamadan sonra: ");
	
		for(int i = 0;i<n;i++)
		{
			System.out.print(dizi[i] +" ");
		}
		
	}

	private static void insertionSort(int[] dizi, int n) {
		for(int i = 1; i<n;i++)
		{
			for(int j = i ; j > 0; j--)
			{
				if(dizi[j] < dizi[j-1])
				{
					int temp;
					
					temp = dizi[j];
					dizi[j] = dizi[j-1];
					dizi[j-1] = temp;
					
				}
			}
				
		}
		
	}

}
