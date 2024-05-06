package morpion;

import java.util.Scanner;

public class Pincipal {

	public static void main (String []args ) {
		
		System.out.println("######## Bienvenue dans le jeu Morpion ########");

	Scanner entier1 = new Scanner(System.in);
	System.out.println("Entrer un entier entre 3 et 5 ");
	int entier = entier1.nextInt();	
		
	int [][] tableau =new int [entier+2][entier+2];
	
	mesMethodes.afficherMonTableau (tableau);
		
}
	
	public static class mesMethodes {
		
		public static void afficherMonTableau (int [][]tableau ) {
			
			for (int i= 0; i< tableau.length; i++) {
				System.out.println(" ");
				for (int j= 0; j< tableau.length; j++) {
					
					tableau [0][j]=99;
					tableau [i][0]=99;
					tableau [tableau.length-1][j]=99;
					tableau [i][tableau.length-1]=99;
					
					if (tableau [i][j] == 99) {
						System.out.print(("#"));
					}
					if (tableau [i][j] == 0) {
						System.out.print((" "));
			}  
					
			
		}
	}
		
	}
	}
}
	

	

