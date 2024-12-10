package sub;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lamdaexp extends Maps implements inter,inter2 {
	
   static void sum(Object o) {
		System.out.println(Integer.parseInt(o.toString())* 2);
		
	}
	public static void main(String[] args) {
	  List<Object> strin = Arrays.asList(2,3);
	     strin.forEach((e)-> sum(e));
	     
	     System.out.println(inter.make(10));
	}
	
	
}
