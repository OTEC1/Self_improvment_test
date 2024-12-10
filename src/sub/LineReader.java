package sub;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LineReader {
	
	public static void main(String[] args) {
		
		try {
			//BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\OTEC\\Documents\\TXT\\Test\\Class3.txt"));
			LineNumberReader reader = new LineNumberReader(new FileReader("C:\\Users\\OTEC\\Documents\\TXT\\Test\\Class3.txt"));
			List list = new ArrayList<>();
			Map  mp = new HashMap<>();
			String read = null;
			while((read = reader.readLine()) != null) { 
				mp.put(reader.getLineNumber(),read);
				    list.add(mp);
			}
			
			reader.close();
			System.out.println(list.size());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
