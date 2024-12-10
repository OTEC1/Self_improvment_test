package sub;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Setclass {

	public static void main(String args []) {
		
		Set<String> str = new HashSet<String>();
		str.add(DAO.string1());
		str.add(DAO.string2());
		
		for(Iterator<String> s = str.iterator(); s.hasNext();) {
			System.out.println(s.next());
		}
		
		Iterator<String> sb = str.iterator(); 
		do {
			
			System.out.println(sb.next());
			
		}while(sb.hasNext());
		
	}
}
