package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.lang.Object; 

public class sample1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Pune");
		list.add(122);
		list.add('c');
		list.add(true);
		System.out.println("By using for each loop");
		for(Object obj:list) {
			System.out.println("The index is "+obj);
		}
		System.out.println("**************************");
		System.out.println("By using for  loop");
	
		for(int i  = 0 ; i < list.size(); i++) {
			System.out.println("The index is i = "+i+" : "+list.get(i));
		}
		System.out.println("**************************");
		//list.set(1, 121);
		System.out.println("The list is  = "+list);
		System.out.println("**************************");
		System.out.println("BY using Iterator");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("The lis is = "+itr.next());
		}

		System.out.println("**************************");
		System.out.println(list.get(0));
		System.out.println("**************************");
		System.out.println("Sorting operations");
		try{
			Collections.sort(list);
		}catch(Throwable e) {
			System.out.println(e);
		}
		System.out.println("Sorting operations"+list);
		System.out.println("**************************");
		System.out.println("For each method");
		list.forEach(a ->{
			System.out.println(a);
		});
		
		
	}

}
