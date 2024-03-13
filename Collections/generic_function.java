package Collections;

import java.util.ArrayList;


public class generic_function {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Ajay");
		l1.add(121);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(451);
		l2.add(321);
		l2.add(657);
		l2.add(954);
		System.out.println("The Element are = "+l2);
		System.out.println("*********************");
		System.out.println("By using for   loop");
		for(int i = 0;i<l2.size();i++) {
			System.out.println(l2.get(i));
		}
		System.out.println("*********************");
		System.out.println("By using for each  loop");
		for(Object obj:l2) {
			System.out.println(obj);
		}
		System.out.println("*********************");
		System.out.println("By using for each  method");
		l2.forEach(a ->{
		
			System.out.println(a);
		});
		
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		l4.add(1211);
		l2.addAll(l4);
		System.out.println("The l4 adding element : "+l2);
		
		ArrayList<String> l5 = new ArrayList<String>();
		l5.add("Vimal");
		l5.add("suman");
		l5.add("Ajay");
		l5.add("vijay");
		
		//l5.addAll(l4);
		
		l5.retainAll(l1);
		System.out.println("Retain only duplicate element = "+l5);
		l5.addAll(l1);
		System.out.println("The Element n l5  ="+l5);
		l5.removeAll(l1);
		System.out.println("Afte remove"+l5);
		
		
		
	}

}
