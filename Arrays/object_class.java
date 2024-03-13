package Arrays;

public class object_class {
	public object_class() {
		System.out.println("The display is grant");
	}

	void display() {
		System.out.println("Hello iam ajay");
	}
	
public class ref_class{
	ref_class(){
		System.out.println("u r in ref class");
	}
}
	static object_class obj  = new object_class();
	
	
	
	public static void main(String[] args) {
	
		object_class ref  =  new object_class();
		System.out.println("The hexadecimal add is = "+ref.toString());
		System.out.println("The hashcode  = "+ref.hashCode());
		object_class s1 = new object_class();
		System.out.println("The address of two string is  = "+s1.equals(ref));
		
	}

}
