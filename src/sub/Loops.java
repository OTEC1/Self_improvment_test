package sub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Loops {

	public static void main(String args []) {
		List l = Looping();
//		for(Iterator<Map<String,Object>> s = l.iterator(); s.hasNext();) {
//			Map m = s.next();
//			int cal = (int) m.get("amount");
//			int total = cal * 2;
//			System.out.println(total);
//		}
		
//		ListIterator<Map<String,Object>> lit = l.listIterator();
//		Iterator<Map<String,Object>> it = l.listIterator();
//		Iterator<Map<String,Object>> t = l.iterator();
//		do {
//			//lit.add(map3());
//		   System.out.println(t.next()); 
//		}	
//		 while(t.hasNext());
		
		Iterator<Map<String,Object>> itb = l.listIterator();
		
//		for(int i=0; i < l.size(); i++) {
//			Map<String,Object> m = (Map) l.get(i);
//			System.out.println(m.get("name"));
//		}
		
		
//		 int i=0;
//		 while(i < l.size()) {
//			 System.out.println(l.get(i));
//			 i++;
//			 
//		 }
			
		int j=0;
		do {
			System.out.println(l.get(j));
			j++;
		}while(j <l.size()); 
		
	}
	
	
	public static List<Map<String,Object>> Looping(){
		List list = new ArrayList<Map<String,Object>>();
		
		list.add(DAO.map());
		list.add(DAO.map2());
		
		return list;
	}
	

	
}