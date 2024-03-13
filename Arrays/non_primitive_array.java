package Arrays;

public class non_primitive_array {
	
	int age ;
	double salary;
	
	public non_primitive_array(){
		age = 25;
		salary= 250.25;
		System.out.println("The age is  = "+age);
		System.out.println("The salary is  = "+salary);
	}
	
	public non_primitive_array(int a){
		age = 65;
		salary= 5000.14;
		System.out.println("The age is  = "+age);
		System.out.println("The salary is  = "+salary);
	}
	
	public non_primitive_array(double v){
		age = 42;
		salary= 56500.14;
		System.out.println("The age is  = "+age);
		System.out.println("The salary is  = "+salary);
	}
	
	public static void main(String[] args) {
	//	non_primitive_array s1 = new non_primitive_array();
		non_primitive_array[] e1 = new non_primitive_array[] {new non_primitive_array(),new non_primitive_array(25), new non_primitive_array(25.25)};
		//OR
		non_primitive_array[] e3 = {new non_primitive_array(),new non_primitive_array(25), new non_primitive_array(25.25)}; 
	}

}
