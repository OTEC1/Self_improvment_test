package sub;

import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;

public class Queue {
	
	public static void main(String args []) {
		PriorityQueue strq = new PriorityQueue();
		strq.add(DAO.string1());
		strq.add(DAO.string2());
		
		System.out.println(strq);
		
//		for(Iterator<Object> it = strq.iterator(); it.hasNext();) {
//			System.out.println(it.next());
//		}
		
		Deque<String> strqp =  new ArrayDeque<String>();
		strqp.add(DAO.string1());
		strqp.add(DAO.string2());
		for(Iterator<String> it = strqp.iterator(); it.hasNext();)
		System.out.println(it.next());
		
		
	}

}
