package soru3;

import java.util.ArrayList;
import java.util.List;

/*N boyutunda 0-10 aras� rastgele say�lardan olu�an bir dizi tan�mlay�n�z.
 *  Bu dizi i�inde m�kerrer olan elemanlar� ekrana yazd�ran algoritmay� tasarlay�n�z.
�rnek: { 2, 4, 5, 11, 33, 2, 5, 55, 100, 1 } */


public class duplicateNumbers {
	public static void main(String[] args) {
		
		int[] arr = new int[20];
		
		for (int i= 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*10);
		System.out.println(arr[i] +" ");
		}
		List<Integer> x = new ArrayList();
		int a=0;
		
		for(int i=0; i <arr.length; i++) {
			for(int j = i+1; j<arr.length; j++ ) {
				if(arr[i] == arr[j]) {
					a++;
				}
			}
			if (a >=1) {
				if(!x.contains(arr[i])) {
					x.add(arr[i]);
				}
				
				
				
				
			}
			a=0;
		}
		
		System.out.println("duplicate numbers: " +x);
	}

}
