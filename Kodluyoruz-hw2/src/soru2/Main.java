package soru2;

import java.util.Arrays;

public class Main {
	/*N x M ile M x T boyutlar�nda 0-10 aras� rastgele say�lardan olu�an iki matris tan�mlay�n�z. 
	 * Bu iki matrisin �arp�m�n� yapan fonksiyonu yaz�n. �arp�m sonucu olu�an matrisi ekrana yazd�r�n. 
	 * Bu matris �arp�m�n� yapan s�n�f� Generic tipte tan�mlay�n�z. 
	 * Matris s�n�f� double, int, float, long gibi Number k�kenli matrisleri �arpabilmelidir.
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
