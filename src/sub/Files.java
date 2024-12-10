package sub;

import java.io.File;
import java.io.FilenameFilter;

public class Files {
	
	public static void main(String[] args) {
		
		
		File file = new File("C:\\Users\\OTEC\\Documents\\TXT");
		String[] files = file.list();
//		File[] files = file.listFiles();
//		
		for(String name : files) {
			System.out.println(name); 
			File fi = new File(file + File.separator + name);
		       check(fi);
		}
	}
	
	
	static void check(File files) {
		
		if(!files.isDirectory())
			System.out.println();
		else {
		FilenameFilter filter = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if(dir.isHidden()) {
					return  true;
				}else
				  return false;
			}
		};
		
		File[] filtered = files.listFiles(filter); 
		for(File file : filtered) 
				System.out.println(file.getName());
		}
		

	}

}
