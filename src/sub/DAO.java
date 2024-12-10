package sub;

import java.util.HashMap;
import java.util.Map;

public class DAO {
	
	 static Map<String,Object> map(){
		Map<String,Object> mp = new HashMap<>();
		mp.put("amount", 20);
		mp.put("name", "smith");
		return mp;
	}
	
	 static Map<String,Object> map2(){
		Map<String,Object> mp = new HashMap<>();
		mp.put("amount", 10);
		mp.put("name", "James");
		return mp;
	}
	 static Map<String,Object> map3(){
		Map<String,Object> mp = new HashMap<>();
		mp.put("amount", 30);
		mp.put("name", "Bob");
		return mp;
	}
	 
	 static String string1(){
			 return "Bob";
			
		}
	 
	 static String string2(){
		 return "Adam";
		
	}
	

}
