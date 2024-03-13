package Arrays;

import java.util.Arrays;
public class Arrays_pridefined {

	public static void main(String[] args) {
		int[] student_id = {121,232,245,651,321,214};
		
		for (int i : student_id) {
			System.out.print(i+" ,");
		}
		// clone() allows you to copy array
		int[] clonable = student_id.clone();
		System.out.println();
		
		for (int j : clonable) {
			System.out.print(j+" ,");
			
		}
		System.out.println("\n");
		// equals()
		System.out.println("***********************");

		System.out.println("Is that two array is equals : "+Arrays.equals(student_id, clonable));
		
		//if copy of only two element
		
		int[] copy_of = Arrays.copyOf(student_id, 3) ;
		for (int k : copy_of) {
			System.out.println(k);
		}
		System.out.println("\n");
		int[] copy_of_selected = Arrays.copyOfRange(student_id, 1,3);
		for (int i : copy_of_selected) {
			System.out.println(i);
		}
		Arrays.sort(student_id);
		for (int i : student_id) {
			System.out.print(i+" ,");
		}
		
	
		
	}

}
