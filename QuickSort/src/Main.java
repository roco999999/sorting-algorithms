import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int[] dizi = {4, 5, 3, 1, 2};    // dizi 5 elemalı ise


		int begin = 0
		                 ;
		int end = 4;
		
		System.out.println("begin: " + begin + " \nend: " + end);
		
		quickSort(dizi,begin,end);
	
		System.out.print("dizinin sirali hali: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(dizi[i] + " ");
			
		}
	}

	public static void quickSort(int []dizi, int begin, int end) {
		
		if(begin < end)
		{
			int partitionIndex = partition(dizi , begin ,end);
		
			quickSort(dizi,begin, partitionIndex-1);
			quickSort(dizi, partitionIndex+1, end);
		}
		
	}

	private static int partition(int []dizi ,int begin, int end) {
		
		int pivot = dizi[end];
		int i = (begin -1) ;
		
		
		for(int j = begin; j < end;j++)
		{
			if(dizi[j] <= pivot)
			{
				i++;
				
				int temp = dizi[i];
				dizi[i] = dizi[j];
				dizi[j] = temp;
				
			}
		}
		
	
		int temp =dizi[i + 1] ;
		dizi[i + 1] = dizi[end];
		dizi[end] = temp;
		
		
		
		return i+1;
	}

}
