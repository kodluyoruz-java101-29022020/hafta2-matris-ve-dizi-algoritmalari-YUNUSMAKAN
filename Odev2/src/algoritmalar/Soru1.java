package algoritmalar;

public class Soru1 {
// hocam bu sorunun yarisini anlamadim arkadasdan bakarak yaptim.
	// Hocam sizden rica etsem  odevin cevaplarini atarken yorum satirlarinda aciklama yazarmisiniz dersteki orneklerdeki gibi.
	public static void main(String[] args)
	{
      
		int[][] matrice = {{0,1,0} , {0,0,1}, {1,1,1}, {0,0,0}};
       
		System.out.println("Matrice");
		
		for(int i = 0; i < matrice.length ; i++ ) {
			
			for(int j = 0; j < matrice[0].length ; j++ ) {
				
				System.out.print(matrice[i][j]);
				
			}
			System.out.println("  ");
		}
		
		System.out.println();
		
		int[][]  newMatrice = new int[matrice.length][matrice[0].length];
		int aliveCount = 0;
		
		for(int i = 0; i < matrice.length; i++)
		{
			for(int j= 0; j< matrice[0].length; j++) 
			{
				
				if(i>0 && j<0) 
				{
					if(i==matrice.length -1 && j == matrice[0].length -1) {
						aliveCount = matrice[i][j-1] + matrice[i-1][j];
					}
					else if( i< matrice.length-1 && j == matrice[0].length -1) {
						aliveCount = matrice[i][j-1] + matrice[i-1][j];
					}

					else if( i == matrice.length-1 && j < matrice[0].length -1) {
						aliveCount = matrice[i][j-1] + matrice[i][j+1]+ matrice[i-1][j];
					}

					else
						aliveCount = matrice[i][j+1] + matrice[i][j-1] + matrice[i+1][j] + matrice[i-1][j];
				   }

				else if(i == 0 && j < matrice[0].length) 
				{
					
					if(j == matrice.length -1) {
						aliveCount = matrice[i][j-1] + matrice[i+1][j];

					}
					else if(j==0){
						aliveCount = matrice[i][j+1] + matrice[i+1][j]; 
					}
					else
						aliveCount = matrice[i][j-1] + matrice[i][j+1] + matrice[i+1][j];
			     }
				else
					if(i > 0 && j == 0) 
					{
						
						if(i==matrice.length-1) {
							aliveCount = matrice[i-1][j] + matrice[i][j+1];
						}
						else
							aliveCount = matrice[i-1][j] + matrice[i][j+1];
					}

				if(matrice[i][j] == 1) 
				{
					
					if(aliveCount < 2 )
						newMatrice[i][j] = 0;
					
					else if(aliveCount == 2 || aliveCount == 3) 
						newMatrice[i][j] = 1;
						
					else if(aliveCount > 3)
						newMatrice[i][j] = 0;

					
					
				}
				else
					newMatrice[i][j]  = 1;
	
		
			}
			
	
		}
     
		
	System.out.println("New Matrice");
		
		for(int i = 0; i < newMatrice.length ; i++ ) 
		{
			
			for(int j = 0; j < newMatrice[0].length ; j++ ) {
				
				System.out.print(newMatrice[i][j]);
				
			}
			System.out.println(" ");
		}
	}
	
	

}
