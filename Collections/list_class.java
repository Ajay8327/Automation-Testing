package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class list_class {

	public list_class object_creation( list_class list_class) {
		//System.out.println("The value of i is = "+i);
		//System.out.println("The value of j is  = "+j);
		return list_class;
	}
	
	
	
	
	public static void main(String[] args) {
		//list is always recommend the object

		ArrayList a1 = new ArrayList();
		//OR
		List a2 = new ArrayList();
		a2.add("Pune");
		a2.add(120);
		a2.add('c');
		a2.add(true);
		System.out.println("The Arraylist are = "+a2);
		list_class s1 = new list_class();
		a2.add(null);
		System.out.println("************************");
		//a2.add(s1);
		a2.add(2,"Pune");
		System.out.println("The legth of list = "+a2.size());
		try{
			for(int i = 0;i<=a2.size();i++) {
		
			System.out.println("The index is = "+i +" value "+a2.get(i));
		}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("continue");
		}
		System.out.println("The Arraylist are = "+a2);
		
		for(Object obj :a2) {
			System.out.println(obj);
		}
		System.out.print("****************Add All*************");
	
		List a4 = new ArrayList();
		a4.add("ajay Gaikwad");
		a4.add(451);
		a4.add('f');
		a4.add(false);
		a4.addAll(a2);
		a4.add(new ArrayList());
		System.out.println("The a4 list are  = "+a4);
		System.out.println(a4.indexOf("ajay Gaikwad"));
		System.out.println(a4.equals(a2));
		System.out.println("*********************");
		Iterator itr = a4.iterator();
		while(itr.hasNext()) {
			System.out.println("The values are = "+itr.next());
		}
		System.out.println("The current status of the element  = "+itr.hashCode());
		a4.set(2, "You r changed");
		//Collection.sort(a4);
		Iterator itrs = a4.iterator();
		while(itrs.hasNext()) {
			System.out.println(itrs.next());
		}
	}

}
