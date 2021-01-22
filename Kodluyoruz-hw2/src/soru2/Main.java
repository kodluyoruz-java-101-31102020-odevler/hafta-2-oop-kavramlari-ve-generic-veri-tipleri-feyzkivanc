package soru2;

import java.util.Arrays;

public class Main {
	/*N x M ile M x T boyutlarýnda 0-10 arasý rastgele sayýlardan oluþan iki matris tanýmlayýnýz. 
	 * Bu iki matrisin çarpýmýný yapan fonksiyonu yazýn. Çarpým sonucu oluþan matrisi ekrana yazdýrýn. 
	 * Bu matris çarpýmýný yapan sýnýfý Generic tipte tanýmlayýnýz. 
	 * Matris sýnýfý double, int, float, long gibi Number kökenli matrisleri çarpabilmelidir.
	 */
public static void main(String [] args) {

	
	
	
	int [][] matrice1 = new int [4][4];
	int [][] matrice2 = new int [4][4];
	for (int row =0 ; row < matrice1.length; row++) {
		for (int column=0; column<matrice1[row].length; column++) {

		matrice1[row][column] = (int) (Math.random()*10);
	}	
}	

	
	
	for (int row =0 ; row<matrice1.length; row++) {
		
		for(int column = 0; column<matrice1[row].length; column++) {
			
			System.out.print(matrice1[row][column] + " ");
			
			
		}
		
		System.out.println();
		
		
	}
	for (int row =0 ; row < matrice2.length; row++) {
		for (int column=0; column<matrice2[row].length; column++) {

		matrice2[row][column] = (int) (Math.random()*10);
	}	
}	

	
	
	for (int row =0 ; row<matrice2.length; row++) {
		
		for(int column = 0; column<matrice2[row].length; column++) {
			System.out.print(matrice2[row][column] + " ");
			
			
		}
		
		System.out.println(" ");
		
	}

	System.out.println("Multiple");
	carpim<Integer> mult = new carpim<Integer>();
	mult.multiply(matrice1, matrice2);
	
}



	
	
	
	
	
	
}
