package Arrays;

public class multi_di_array {

	public static void main(String[] args) {
	int[][] id_s = new int [3][3];
	id_s[0][0]=1;
	System.out.println(id_s[0][0]);
	System.out.println("*************************");
	int[][] numbers = {{11,22,33},{44,55,66},{45,65,68}};
     for (int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[0][i]+" ");	
	}
     System.out.println();
     for (int i = 0; i < numbers.length; i++) {
 		System.out.print(numbers[1][i]+" ");	
 	}
     System.out.println();
     for (int i = 0; i < numbers.length; i++) {
  		System.out.print(numbers[2][i]+" ");	
  	}
     System.out.println("\n*************************");
     for (int i = 0; i < numbers.length; i++) {
		for (int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[i][j]);
		}
	}
     
     
	}
	

}
