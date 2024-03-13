package Arrays;

public class average_sum {

	public static void main(String[] args) {
		
		int[] num = {1,21,-45,121,232,-45,3};
		
		System.out.println("The length of array  = "+num.length);
		double sum = 0;
		for(int i: num) {
		sum = sum + i;
		
		}

		System.out.println("the sum of array = "+sum);
		 double average_sum;
		 average_sum = num.length;
		 average_sum=sum/average_sum;
		 System.out.println("The average of the array  = "+average_sum);
		 System.out.println("*****************");
		 System.out.println(+sum);
		 double multi = sum*num.length;
		 System.out.println(+multi);
		
	}

}
