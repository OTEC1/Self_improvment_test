package sub;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;


public class Maps {
	
	public static void main(String args []) {
		
		Map<String,Object> strm = new HashMap<String,Object>();
		strm.put("Key", "value 1");
		strm.put("Key1", "value 2");
		strm.put("Key2", "value 3");
		
//		for(Map.Entry<String,Object> en : strm.entrySet()) {
//			 System.out.println(en.getKey()+ " "+ en.getValue());
//			
//		}
		
//		ListIterator lit = new Loops().Looping().listIterator(new Loops().Looping().size());
//		while(lit.hasPrevious()) {
//			System.out.println(lit.previous());
//		}
		
//		for(int e= new Loops().Looping().size() - 1; e >= 0; e--) {
//			System.out.println(new Loops().Looping().get(e));
//		}
		
		
//		int [][] in = new int[5][10];
//		in[0][1] = 0;
//		in[1][2] = 1;
//		in[2][3] = 2;
//		in[3][4] = 3;
		
		//int [][] in = {{0,1},{2,3},{4,5}};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index");
		int in = sc.nextInt();
	
		
		int times = in * 2;
		
		int [][] num = new int[in][times];
		
	
		int y=0;
		for(int e=0; e < in; e++)
			for(int u=0; u < in; u++) {
				num[e][u] = y;
			   y++;
			}
		
		int i=0;
		for(int s=0; s < in; s++) {
			System.out.print(i+"* ");
			for(int p=0; p < in; p++) {
				System.out.print(num[s][p]);
			}
			i++;
			System.out.println();
		}
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Pick a column");
		int pick = sc1.nextInt();
		
		for(int p=0; p < num.length; p++)
		     System.out.print(num[pick][p]);

		
	
		
		
		
		
//		for(int e=0; e < in.length; e++)
//			for(int p=0; p < in.length -1; p++)
//			  System.out.println(in[e][p]);
		
	
		
		
		
//		for(Iterator<Object> it = strm.values().iterator(); it.hasNext();) {	
//			System.out.println(it.next());
//			
//			
//		}
		
		
		
		
		
		
		
		
	}

}
