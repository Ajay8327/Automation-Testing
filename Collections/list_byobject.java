package Collections;

import java.util.ArrayList;
import java.util.List;
class book{
	int id;
	String name,address,designation;
	
	public  book(int id,String name,String address,String designation) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.designation=designation;
		System.out.println(id);
       }
}


public class list_byobject {

	public static void main(String[] args) {
		book b1 =  new book(10,"ajay","majiwad","data analyst");
		book b2 =  new book(50,"vijay","majiwad","data analyst");

		
		List<book> list = new ArrayList<book>();
		list.add(b1);
		list.add(b2);		
		
		System.out.println(list.get(0).name);
	}
}

