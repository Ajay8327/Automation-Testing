package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue_class {

	public static void main(String[] args) {
		Queue queue = new PriorityQueue();
		queue.add(10);
		queue.add(20);
		queue.add(56);
		queue.add(65);
	//	System.out.println("The queue is  = "+queue);
		queue.forEach(a1 ->{
			System.out.println(a1);
		});
		
		for(Object obj:queue) {
			System.out.println(obj);
		}
		

	}

}
