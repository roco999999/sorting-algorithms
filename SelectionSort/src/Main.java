import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Kac adet sayi girmek istersiniz: ");
		int n = scan.nextInt();
		int[] dizi = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("sayi: ");
			dizi[i] = scan.nextInt();
		}

		
		selectionSort(dizi, n);
		
		System.out.println();
		System.out.print("Siralamadan sonra: ");
	
		for(int i = 0;i<n;i++)
		{
			System.out.print(dizi[i] +" ");
		}
		
	}
		
		
		
	

	private static void selectionSort(int[] dizi, int n) {
		
		for(int i = 0;i < n-1;i++)
		{
			int min = 999999;
			int temp = 0;
			
			for(int j = i;j<n;j++)
			{
				if(min > dizi[j])
				{
					min = dizi[j];
					temp = j;
				}
				
			}
				dizi[temp] = dizi[i];
				dizi[i] = min;
				
		}
		
	}

}
