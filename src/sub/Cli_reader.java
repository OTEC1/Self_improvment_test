package sub;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class Cli_reader {
	
	public static void main(String[] args) {
		try {
			String url = "C:\\Users\\OTEC\\Documents\\TXT\\Test\\Class1.txt";
			InputStream input = new FileInputStream(url);
			OutputStream stream = new FileOutputStream("C:\\Users\\OTEC\\Documents\\TXT\\Test\\Class2.txt");
//			int byteReader = -1;
//			 while((byteReader = input.read()) != -1) {
//				 stream.write(byteReader);
//			 }
			
			long fileSize = new File(url).length();
			byte[] by = new byte[(int) fileSize];
			int byteRead = input.read(by);
			stream.write(by,0,byteRead);
		
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
