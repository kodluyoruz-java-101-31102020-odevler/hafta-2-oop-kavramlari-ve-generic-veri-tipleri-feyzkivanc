package soru2;

public  class carpim <T>{
		
	
	public   int[][]  multiply(int[][] matrice1, int[][] matrice2){
		
		int[][] multiplyMatrice= new int[matrice1.length][matrice2[0].length];
		for( int i=0; i<matrice1.length;i++) {
			for(int k =0; k<matrice2[0].length; k++) {
				
				for (int x=0; x<matrice1[0].length;x++) {
					multiplyMatrice[i][k] =matrice1[i][k]*matrice2[x][k];
				}
				System.out.println(multiplyMatrice[i][k]);
				
			}
			System.out.println();
		}
		
		
		
		return multiplyMatrice;
		
	
	
	
	}
	}

