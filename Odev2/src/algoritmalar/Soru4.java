package algoritmalar;


public class Soru4 {

	public static void main(String[] args) {
	
     int[] array = new int[10];
     array = new int[]{ 1,4,7,3,1,8,6,2,6,2 };
		
		
		for(int i = 0 ; i < array.length ; i ++) 
		{
			
			for(int j = i+1 ; j < array.length ; j++) 
			{
				
				if(array[i] == array[j]) 
				{
					
					System.out.print(array[i] + "  ");
				}
						
	        }

		}
	}
}
		
