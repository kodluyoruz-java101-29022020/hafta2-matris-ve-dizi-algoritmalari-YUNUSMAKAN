package algoritmalar;

public class Soru2 {

	public static void main(String[] args) {

  int[][] matrice = { {1,2,3,4,5} ,{16,17,18,19,6}, { 15,24,25,20,7} ,{14,23,22,21,8}, {13,12,11,10,9}};
		  
   int w = 0;
   int row = matrice.length-1;
   int z = 0;
   int column = matrice[0].length-1;
   while(w<= row && z <= column) {
	   for(int i = w; i<=column; i++) {
		   System.out.println(matrice[w][i]);
	   }
	   for(int i = w+1; i<=row; i++) {
		   System.out.println(matrice[i][column]);
	   }
	   if(w+1 <= row) {
		   for(int i = column-1; i >= z; i--) {
			   System.out.println(matrice[row][i]);
		   }
	   }
	   if(w+1 <= row) {
		   for(int i = row-1; i > w; i--) {
			   System.out.println(matrice[i][z] );
		   }
   }
	   w++;
	   row--;
	   z++;
	   column--;
		
	}

}
}
