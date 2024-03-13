package Arrays;

public class array_method {
	
	static void array_print(int a[]) {
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	static void array_sum(int b[]) {
		double sum=0;
		for (int j : b) {
			sum = sum+j;
			}
		System.out.println("The sum of array = "+sum);
	}
	
	
	static void minimum_num(int c[]) {
		int min = c[0];
		for (int i = 1; i < c.length; i++) {
        // System.out.println(+i);	
         if(min>c[1]) {
        	 min=c[i];
         }
		}
		System.out.println("The min number is  = "+min);
	}
	
	
	static void maximum_num(int f[]) {
		int max = f[0];
		for (int i = 1; i < f.length; i++) {
			if (max<f[i]) {
				max=f[i];
				
			}
			
		}
		System.out.println("The max number is  = "+max);
	}

	public static void main(String[] args) {
		int[] arr  = {1,2,3,1,4,4};
		array_method.array_print(arr);
		array_method.array_sum(arr);
        //minimum_num(arr);
        minimum_num(arr);
        maximum_num(arr);
	}

}
