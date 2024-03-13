package Arrays;

public class Array_sample1 {

	public static void main(String[] args) {
		
		int[] student_id;//Decalred
		
		student_id = new int[3];// initilization
		
		System.out.println("Program starts ");
		System.out.println("The Student1 id is  = "+student_id[0]);
		student_id[0]=101;
		System.out.println("After Initialized The Student1 id is  = "+student_id[0]);
		System.out.println("The Student2 id is  = "+student_id[1]);
		student_id[1]=102;
		System.out.println("After Initialized The Student2 id is  = "+student_id[1]);
		student_id[2]=103;
		System.out.println("After Initialized The Student3 id is  = "+student_id[2]);
		System.out.println("***********************");
		int[] empid = {112,121,352,654,554,454};
		//               0  1   2   3   4   5
		System.out.println("on fifth position  = "+empid[4]);
		
		System.out.println("The length of array  = "+empid.length);
		
		// once we get length then go for for loop
		System.out.println("88888888888888888888888888888888888");
		for (int i = 0; i < empid.length; i++) {
			System.out.println("The array is  = "+empid[i]+", index ="+i);
			System.out.println(+i);}
			
		String[] ajay_details  = {"ajay","Mohan","Gaikwad"};
		for (int j = 0; j < ajay_details.length; j++) {
			System.out.println("The details = "+ajay_details[j]+", index  = "+j);
			
		}
			
			for (int k = 0; k < ajay_details.length; k++) {
				System.out.print(ajay_details[k]+" ");
			}
			System.out.print("\n");
			char a = 'A';
			int b=a;
			System.out.println(b);
			
			for(char g = 'a'; g<='z';g++) {
			  System.out.print(+g+",");
			}
			
			System.out.print("\n");
	        for (String details : ajay_details) {
	        	System.out.println(details);
				
			}
			
			
		}
		

	}


