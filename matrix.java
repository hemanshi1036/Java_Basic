import java.util.Random;
class matrix{
	public static void main(String[] args){
		
	Random r = new Random();
	
	int [][] matrix = new int[6][6];
		

		for(int i = 0; i<6; i++){
		int count = 0;
			for(int j = 0; j<6; j++){
			matrix [i][j] = r.nextInt();
			if(matrix [i][j] % 2 == 0){
				System.out.println("0");
			}
			else{
				System.out.println("1");
				count++;
				}

			}
		
			System.out.println("");
			if(count%2=0){
				System.out.println("Number of '1' is in row even" );
			}
			else{
				System.out.println("Number of '1' is in row odd");
				}
	
		}

				for(int j = 0; j<6; j++){
				int count1 = 0;
					for(int i = 0; i<6; i++){
			if(matrix [i][j] % 2 != 0){
		
				count1++;
				}

}
		System.out.println("");
			if(count%2==0){
				System.out.println("Number of '1' in column is even" );
			}
			else{
				System.out.println("Number of '1' in column  is odd");
				}
	
		}
						  
	
}
}  