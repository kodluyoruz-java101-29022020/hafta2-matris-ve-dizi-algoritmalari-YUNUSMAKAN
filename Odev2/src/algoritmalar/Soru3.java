package algoritmalar;

public class Soru3 {

	public static void main(String[] args) {
		
		int[][] matrice1 = { {2,3,5} , {2,7,9} ,{6,6,2}};
		int[][] matrice2 = { {2,3} , {4,8} , {6,8}};
    
		multiplyMatrices(matrice1 , matrice2);
}

	
	public static void multiplyMatrices(int[][] firstMatrice, int[][] secondMatrice) {
		
		int[][] resultMatrice = new int[firstMatrice.length][secondMatrice[0].length];
		
		for(int i=0; i < resultMatrice.length; i++) {
			
			for(int j=0; j < resultMatrice[0].length; j++) {
				
				int result = 0;
				for(int k=0; k < secondMatrice.length; k++) {
					result += firstMatrice[i][k] * secondMatrice[k][j];
				}
				
				System.out.println(resultMatrice[i][j] = result);
			}
			System.out.println("\t");
		}
}
}
