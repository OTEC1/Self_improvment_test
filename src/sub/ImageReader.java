package sub;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ImageReader {
	
	private static int[] pngSign= {137,80,78,71,13,10,26,10};
	
	public static void main(String[] args) {
		
		try {
			InputStream stream = new FileInputStream("C:\\Users\\OTEC\\Documents\\Assests\\beeps.png");
			
			
			boolean  isPhoto = true;
			int [] header = new int[8];
			
			for(int e=0;e < 8; e++) {
				header[e] = stream.read();
				
				
				if(header[e] != pngSign[e]) {
					isPhoto = false;
					//break;
				}
				
			}
			System.out.println(isPhoto);
			TextreadWrite();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

public static void TextreadWrite() {
	   int bufferSize = 4096;
		try {
			
			InputStream in = new FileInputStream("C:\\Users\\OTEC\\Documents\\TXT\\Test\\Class1.txt");
			OutputStream out = new FileOutputStream("C:\\Users\\OTEC\\Documents\\TXT\\Test\\Class3.txt");
			
			int writePage = -1;
			byte[] by = new  byte[bufferSize];
			
			while((writePage = in.read()) != -1) {
				out.write(by,0,writePage);
			}
			
			}catch (Exception e) {
				System.out.println(e);
			}
	}


static void readNio() {
	try {
		
		 byte[] by = Files.readAllBytes(Paths.get(""));
		  Files.write(Paths.get(""),by);
			
	    } catch (Exception e) {
		// TODO: handle exception
	  }
	
}
	
}



