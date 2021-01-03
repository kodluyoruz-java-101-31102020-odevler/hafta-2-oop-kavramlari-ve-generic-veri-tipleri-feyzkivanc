package soru1;

public class Main {
	
		
		

		    static void spiralMatrice(int a, int b, int x[][]) 
		    { 
		        int i, c = 0, d = 0; 
		  
		       
		  
		        while (c < a && d < b) { 
		            for (i = d; i < b; ++i) { 
		                System.out.print(x[c][i] + " "); 
		            } 
		            c++; 
		  
		           
		           for (i = c; i < a; ++i) { 
		                System.out.print(x[i][b - 1] + " "); 
		            } 
		            b--; 
		  
		            if (c < a) { 
		                for (i = b - 1; i >= d; --i) { 
		                    System.out.print(x[a - 1][i] + " "); 
		                } 
		                a--; 
		            } 
		  
		            
		            if (d < b) { 
		                for (i = a - 1; i >= c; --i) { 
		                    System.out.print(x[i][d] + " "); 
		                } 
		                d++; 
		            } 
		        } 
		    } 
		  
		    public static void main(String[] args) 
		    { 
		        int R = 5; 
		        int C = 5; 
		        int x[][] = { { 1, 2, 3, 4,  5 }, 
		                      { 16,17,18,19, 6 }, 
		                      { 15,24,25,20, 7}, 
		                      { 14,23,22,21, 8},
		                      { 13,12,11,10, 9}};
		         
		          spiralMatrice(R, C, x); 
		    } 
		} 
		 
		 
		 
		 
		 
		 
		 
		       
		 
		   
		
		
		
		
	
