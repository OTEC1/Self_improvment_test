package network;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Http {
	
	static void downloader(String weburl, String path) throws Exception{
		URL url = new URL(weburl);
		HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
		int responseCode = httpCon.getResponseCode();
		
		if(responseCode == HttpURLConnection.HTTP_OK) {
			String fileName = "";
			String disposition = httpCon.getHeaderField("Content-Disposition");
			String contentType = httpCon.getContentType();
			int contentLength = httpCon.getContentLength();
			
//			if(disposition != null) {
//				int index = disposition.indexOf("filename=");
//					if(index > 0) {
//						fileName = disposition.substring(index+10,disposition.length() -1);
//					}
//			 }else
				fileName = String.valueOf(System.currentTimeMillis())+ "." + contentType.substring(contentType.lastIndexOf("/")+1);
			
				InputStream in = httpCon.getInputStream();
				String dir = path + File.separator + fileName;
				
				OutputStream out = new FileOutputStream(dir);
				
				System.out.println(fileName);
				
				int reading = -1;
				byte[] by = new byte[4096];
				
				while((reading = in.read(by)) != -1) {
					out.write(by,0,reading);
				}
				System.out.println("Downloaded");
				in.close();
				out.close();	
		}else
			System.out.println("Error "+httpCon.getResponseCode());	
		httpCon.disconnect();
	}
	
	
	public static void downloads(String webUrl, String path) {
		
		try {
			URL url = new URL(webUrl);
			
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			int response = http.getResponseCode();
			
			if(response == HttpURLConnection.HTTP_OK) {
				
				String contentType = http.getContentType();
				int contentLength =  http.getContentLength();
				
				
				InputStream stream = http.getInputStream();
				String fileName = System.currentTimeMillis()+"."+contentType.substring(contentType.lastIndexOf("/")+1);
				String dir = path + File.separator + fileName;
				OutputStream out = new FileOutputStream(dir);
				byte[] by = new byte[4096];
				int count = -1;
				
				while((count = stream.read(by)) != -1) 
					out.write(by,0,count);
				
				
				stream.close();
				out.close();
				http.disconnect();	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  } 
	
	
	
		public static void main(String[] args) {
			String fileUrl = "https://letsenhance.io/static/8f5e523ee6b2479e26ecc91b9c25261e/1015f/MainAfter.jpg";
			String save = "C:\\Users\\OTEC\\Downloads";
			try {
			downloads(fileUrl, save);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	

}
